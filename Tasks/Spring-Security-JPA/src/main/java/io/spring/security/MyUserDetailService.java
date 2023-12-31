package io.spring.security;

import io.spring.security.model.MyUserDetails;
import io.spring.security.model.User;
import io.spring.security.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
       Optional<User> user = userRepository.findByUserName(userName);

       user.orElseThrow(()->new UsernameNotFoundException("NOT FOUNT  "+userName));

       return user.map(MyUserDetails::new).get();
    }
}
