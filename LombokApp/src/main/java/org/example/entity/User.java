package org.example.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString(includeFieldNames = true)
@EqualsAndHashCode
@Data


public class User {

    @NonNull private int id;
    @NonNull private String name;
    private String lastName;
}
