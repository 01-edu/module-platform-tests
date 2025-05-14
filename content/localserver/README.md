## LocalServer

### Overview

Finally, you are going to understand how the internet works from the server side. The Hypertext Transfer Protocol was created in order to ensure a reliable way to communicate on a request/response basis.

This protocol is used by servers and clients (usually browsers) to serve content, and it is the backbone of the World Wide Web. Still, it is also used in many other cases that are far beyond the scope of this exercise.
For this project you can chose you programing language between Rust or Java.

### Role Play

You are a backend engineer at a startup building a lightweight web server to handle internal APIs and static content with minimal dependencies. Your goal is to deliver a highly available, crash-proof solution that can be extended to support dynamic content via CGI scripts and configured to suit multiple environments.

### Learning Objective

By the end of this project, learners will be able to:

- Design and implement a custom HTTP/1.1-compliant server in either Java or Rust
- Utilize non-blocking I/O mechanisms
- Parse and construct HTTP requests and responses manually
- Configure server routes, error pages, uploads, and CGI scripts
- Evaluate performance under stress and ensure memory and process safety

Technical skills:

- Socket programming
- Asynchronous I/O
- File and process management
- Configuration parsing

### Instructions

- The project must be written in `Java` or `Rust`.
- If you're using Java you can use the Java Core Libraries, namely the `java.nio` package for non-blocking I/O operations and `java.net` for network handling.
- If you're using Rust you can use its standard library paired with the crate `mio` or one with similar features for non-blocking I/O and network handling.
- Make use of an event-driven API for handling connections.

> You **cannot** make use of established server frameworks or asynchronous features/runtimes (e.g. `Netty`/`Jetty`/`Grizzly` in **Java** or `axum`/`rocket`/`hyper`/`async-std`/`tokio` in **Rust**)

#### The Server

Your goal is to write your very own server, which will use the `HTTP` protocol to serve static web pages to browsers.

For your server, you must guarantee the following behavior:

- It **never** crashes.
- All requests timeout if they are taking too long.
- It can listen on multiple ports and instantiate multiple servers at the same time.
- It uses only one process and one thread.
- It receives a request from the browser/client and sends a response using the `HTTP` header and body.
- It is compatible with the `HTTP/1.1` protocol.
- You can compare your results with `NGINX`, which will be used as the reference.
- It is compatible with the latest version of your chosen browser.
- It manages at least [`GET`, `POST`, `DELETE`] methods.
- It is able to receive file uploads made by the client.
- It handles cookies and sessions.
- You should create default error pages for at least the following error codes: [400, 403, 404, 405, 413, 500].
- All reads and writes should be made through an event-driven API.
- All I/O operations should be non-blocking.
- You should manage chunked and unchunked requests.
- You should set the right status for each response.

#### The CGI

- Based on the file extension, the server will execute the corresponding `CGI` (for example, `.php` or `.py`).
- You need to implement only one `CGI` of your choice.
- You are allowed to spawn a new process to run the `CGI` using `ProcessBuilder`.
- `CGI` expects the file to process as the first argument and `EOF` as the end of the body.
- Pay attention to the directory where the `CGI` will run for correct relative path handling.
- The `CGI` will check the `PATH_INFO` environment variable to define the full path.

#### Configuration File

In the configuration file, you should be able to specify the following:

- The host (server_address) and one or multiple ports for each server.
- The first server for a host:port will be the default if the "server_name" doesn’t match any other server.
- Path to custom error pages.
- Limit client body size for uploads.
- Setup routes with one or multiple of the following settings:
  - Define a list of accepted HTTP methods for the route.
  - Define HTTP redirections.
  - Define a directory or a file from where the requested file should be searched (for example, if `/test` is rooted to `/usr/Desktop`, the URL `/test/my_page.html` will route to `/usr/Desktop/my_page.html`).
  - Define a default file for the route if the URL is a directory.
  - Specify a `CGI` to use for a certain file extension.
  - Turn on or off directory listing.
  - Set a default file to answer if the request is a directory.
- No need to manage comments "(#)".

> Routes won’t need to support regular expressions.

#### Testing your server

- Perform stress tests using `siege -b [IP]:[PORT]`. It must stay available at all costs (availability should be up to 99.5%, it will be tested during audits).
- Create tests for as many cases as possible (redirections, bad configuration files, static and dynamic pages, default error pages, etc.).
- You will be required to provide and explain your tests during the audits.
- You can use any language you prefer to write tests, as long as they are exhaustive and the auditor can verify their behavior.
- Test for possible memory leaks before submitting the project.
- Once again, the server should never crash or leak memory.

#### Bonus Challenges

- Implement a second CGI handler (e.g., `.php`)
- Create an admin dashboard or server metrics endpoint

### Example Repository Structures

#### Java

```
/java-server
├── /src
│   ├── Main.java         # Entry point
│   ├── Server.java       # Handles server lifecycle
│   ├── Router.java       # Routes requests
│   ├── CGIHandler.java   # Manages CGI execution
│   ├── ConfigLoader.java # Parses configuration file
│   ├── error.rs          # Error responses
│   ├── utils/
│       ├── Session.java  # Session management
│       ├── Cookie.java   # Cookie utilities
├── config.json           # Server configuration
├── README.md             # Documentation
├── error_pages/          # Custom error HTML files
```

#### Rust

```
/rust-server
├── /src
│   ├── main.rs           # Entry point
│   ├── server.rs         # Handles server lifecycle
│   ├── router.rs         # Routes requests
│   ├── cgi.rs            # Manages CGI execution
│   ├── config.rs         # Parses configuration file
│   ├── error.rs          # Error responses
│   ├── utils/
│       ├── session.rs    # Session management
│       ├── cookie.rs     # Cookie utilities
├── config.yaml           # Server config
├── README.md             # Project overview and setup
├── error_pages/          # Static error page files
```

### Tips

- Avoid hardcoding paths; use the configuration file for flexibility.
- Validate all configuration values at startup.
- Sanitize all inputs before executing CGI.
- Modularize request parsing, routing, and response building.
- Use thread-safe data structures for session and cookie management.
- Ensure no file descriptors or memory is leaked. (This is already guaranteed in safe Rust!)

### Resources

- [RFC 2616 – HTTP/1.1 Specification](https://www.rfc-editor.org/rfc/rfc9112.html).
- [Java NIO Docs](https://docs.oracle.com/javase/tutorial/essential/io/)
- [mio Docs](https://docs.rs/crate/mio/latest)
- [epoll Example](https://man7.org/linux/man-pages/man7/epoll.7.html)
- [CGI Protocol Overview](https://en.wikipedia.org/wiki/Common_Gateway_Interface)
- [siege Load Testing Tool](https://github.com/JoeDog/siege)

### Disclaimer

This project is for educational use only. Using siege or any stress testing tool against a third-party server without explicit permission is illegal and unethical.
