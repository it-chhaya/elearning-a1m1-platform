package co.istad.chhaya.elearning.features.auth;

import co.istad.chhaya.elearning.features.auth.dto.RegisterRequest;
import co.istad.chhaya.elearning.features.auth.dto.RegisterResponse;

public interface AuthService {

    RegisterResponse register(RegisterRequest registerRequest);

}
