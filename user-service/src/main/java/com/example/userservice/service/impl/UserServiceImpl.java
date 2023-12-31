package com.example.userservice.service.impl;

import com.example.userservice.APIClient;
import com.example.userservice.dto.DepartmentDto;
import com.example.userservice.dto.ResponseDto;
import com.example.userservice.dto.UserDto;
import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    private RestTemplate restTemplate;

    @Autowired
    private APIClient apiClient;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public ResponseDto getUser(Long userId) {

        ResponseDto responseDto = new ResponseDto();
        User user = userRepository.findById(userId).get();
        UserDto userDto = mapTo(user);

//        ResponseEntity<DepartmentDto> responseEntity = restTemplate
//                .getForEntity("http://localhost:8080/api/departments/"+user.getDepartmentId(),
//                        DepartmentDto.class);

        //DepartmentDto departmentDto = responseEntity.getBody();
        DepartmentDto departmentDto = apiClient.getDepartmentById(user.getDepartmentId());

        //System.out.println(responseEntity.getStatusCode());

        responseDto.setUser(userDto);
         responseDto.setDepartment(departmentDto);
        return null;
    }

    private UserDto mapTo(User user) {

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());

        return  userDto;
    }
}
