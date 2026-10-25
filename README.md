# Cryptography and Network Security Lab

Simple, exam-oriented implementations for the JNTUH UC(EJ) CS703PC Cryptography and Network Security Lab syllabus.

## Experiments

| Experiment | File | Language |
|---|---|---|
| 1. XOR each character with 0 | `01_XOR_Zero.c` | C |
| 2. AND and XOR each character with 127 | `02_AND_XOR_127.c` | C |
| 3a. Caesar cipher | `Caesar.java` | Java |
| 3b. Substitution cipher | `Substitution.java` | Java |
| 3c. Hill cipher (2x2) | `Hill.java` | Java |
| 4. DES encryption/decryption | `DES.java` | Java |
| 5. Blowfish encryption/decryption | `Blowfish.java` | Java |
| 6. Rijndael/AES encryption/decryption | `AES.java` | Java |
| 7. RC4 logic | `RC4.java` | Java |
| 8. RSA encryption/decryption | `RSA.java` | Java |
| 9. Diffie-Hellman key exchange | `11_DiffieHellman.html` | HTML + JavaScript |
| 10. SHA-1 message digest | `SHA1.java` | Java |
| 11. MD5 message digest | `MD5.java` | Java |

## Requirements

- C compiler such as GCC
- JDK 8 or newer
- A web browser for the Diffie-Hellman HTML file

## Run C programs

```bash
gcc 01_XOR_Zero.c -o xor_zero
./xor_zero

gcc 02_AND_XOR_127.c -o and_xor
./and_xor
```

On Windows with GCC/MinGW, run the generated executable, e.g. `xor_zero.exe`.

## Run Java programs

Open a terminal in this folder. Compile and run the file you need:

```bash
javac Caesar.java
java Caesar
```

The Java source filenames begin with experiment numbers, but each `public class` name is the name used with `java`. For example:

```bash
javac DES.java
java DES
```

If your Java version has trouble compiling a source file whose filename does not match its public class, copy/rename it to the public class name first (for example, `DES.java`). The easiest option is to open the file in your IDE and create a class with the matching name.

## Diffie-Hellman

Open `11_DiffieHellman.html` directly in a browser and click **Calculate**.

## Blowfish keytool note

To generate a keystore key using Java's `keytool`, run:

```bash
keytool -genseckey -alias blowfishkey -keyalg Blowfish -keysize 128 -keystore labkeys.jceks -storetype JCEKS
```

Follow the prompts to set a keystore password. The standalone `Blowfish.java` program uses a demonstration key so it can run without a keystore.

## Important notes

- DES, RC4, SHA-1, and MD5 are legacy algorithms and are not suitable for modern security-sensitive applications. They are included for lab learning only.
- The cryptographic programs are educational demonstrations, not production-ready security designs.
- DES, Blowfish, and AES ciphertext may vary between runs when generated keys or provider defaults vary.
- RC4 is implemented directly to demonstrate its KSA/PRGA logic. Do not use RC4 in real applications.
