# Security Policy

## Supported Versions

| Version | Supported |
| ------- | ------------------ |
| 1.0.x   | :white_check_mark: |
| < 1.0   | :x:                |

## Security Measures

SmartCommerce implements several security best practices to protect user data and ensure application integrity.

### 1. Secure Data Storage
We do **not** store sensitive information (like Authentication Tokens) in plain text `SharedPreferences`.
*   **Implementation**: `EncryptedSharedPreferences` (Jetpack Security Crypto library).
*   **Encryption**: Uses `AES256_GCM` for values and `AES256_SIV` for keys.
*   **Location**: `core:security` module, `TokenManager` class.

### 2. Network Security
*   **HTTPS**: All network communication is performed over HTTPS (enforced by default Android Network Security Config).
*   **Logging**: HTTP logging is enabled only for debug builds to prevent leaking sensitive headers in production.

### 3. Architecture Isolation
*   **Clean Architecture**: Separation of concerns ensures that business logic is isolated from external frameworks, reducing the attack surface.
*   **Dependency Injection**: Hilt is used to manage dependencies, ensuring that security components (like `TokenManager`) are singletons and consistently used.

## Reporting a Vulnerability

If you discover a security vulnerability, please report it via ... (Placeholder for contact info).
