package RestAssured;

public class Authentication_Schema {

    public static void main(String[] args) {

        /*

       Excellent 👍 This is a **very common API / REST interview question**.

Let’s break it clearly.

---

# ✅ What Are Different Authentication Schemes?

Authentication verifies **who you are** before allowing access to APIs.

Here are the most common authentication schemes used in real projects:

---

## 🔷 1️⃣ Basic Authentication

* Username + Password
* Sent in request header (Base64 encoded)
* Not very secure unless used with HTTPS

Example Header:

```
Authorization: Basic dXNlcjpwYXNz
```

Used in:

* Internal APIs
* Simple services

---

## 🔷 2️⃣ Bearer Token Authentication

* Uses access token
* Token generated after login
* Sent in header

```
Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...
```

Very common in:

* REST APIs
* Microservices
* Modern applications

---

## 🔷 3️⃣ OAuth 2.0

Industry-standard authorization framework.

Grant Types:

* Authorization Code
* Client Credentials
* Password Grant
* Refresh Token

Used in:

* Google APIs
* Facebook APIs
* Enterprise applications

---

## 🔷 4️⃣ JWT (JSON Web Token)

* Token-based authentication
* Self-contained token
* Has header, payload, signature

Structure:

```
xxxxx.yyyyy.zzzzz
```

Common in:

* Microservices
* Stateless authentication

---

## 🔷 5️⃣ API Key Authentication

* Unique key provided to client
* Passed in header or query param

Example:

```
x-api-key: 12345abcde
```

Used in:

* Public APIs
* Third-party integrations

---

## 🔷 6️⃣ Digest Authentication

* More secure than Basic
* Hash-based authentication
* Rarely used now

---

## 🔷 7️⃣ OAuth 1.0 (Legacy)

* Used earlier by Twitter APIs
* Complex signature-based auth

---

# 🔥 Visual Overview

![Image](https://substackcdn.com/image/fetch/%24s_%21ljRu%21%2Cf_auto%2Cq_auto%3Agood%2Cfl_progressive%3Asteep/https%3A%2F%2Fsubstack-post-media.s3.amazonaws.com%2Fpublic%2Fimages%2F152fcb14-3acf-4027-a3c2-307f4596ef4b_3000x3900.png)

![Image](https://miro.medium.com/1%2AzicBcGvY3wPGvTSKe8-vjQ.png)

![Image](https://fusionauth.io/img/shared/json-web-token.png)

![Image](https://www.miniorange.com/blog/assets/2023/jwt-structure.webp)

---

# ✅ Difference Between 401 and 403

This is where many candidates get confused.

---

## 🔴 401 – Unauthorized

Means:

> You are NOT authenticated.

Reasons:

* No token provided
* Invalid token
* Expired token
* Wrong credentials

Example:

```
HTTP/1.1 401 Unauthorized
```

Fix:
👉 Provide valid authentication credentials.

---

## 🔵 403 – Forbidden

Means:

> You are authenticated BUT not authorized to access this resource.

Reasons:

* User doesn’t have required role
* Access denied due to permission
* Trying to access admin API as normal user

Example:

```
HTTP/1.1 403 Forbidden
```

Fix:
👉 Change user role or permissions.

---

# 🔥 Simple Comparison Table

| Code | Meaning      | Authenticated? | Authorized? |
| ---- | ------------ | -------------- | ----------- |
| 401  | Unauthorized | ❌ No           | ❌ No        |
| 403  | Forbidden    | ✅ Yes          | ❌ No        |

---

# 🔥 Real-World Example

Scenario:

* You try to access `/admin/users`

Case 1:

* No token → **401**

Case 2:

* Valid token but normal user → **403**

---

# 🔥 Interview-Ready Answer (2-Min Version)

You can say:

> There are multiple authentication schemes like Basic Auth, Bearer Token, OAuth 2.0, JWT, and API Key authentication. In modern APIs, Bearer tokens and OAuth 2.0 are most commonly used.
>
> 401 means the user is not authenticated — either token is missing or invalid.
> 403 means the user is authenticated but does not have permission to access the requested resource.

---

# 🔥 Advanced-Level Add-On (5+ Years)

You can add:

* 401 usually includes `WWW-Authenticate` header
* 403 is authorization failure
* Used role-based access control (RBAC)
* Used in microservices security

---



         */
    }
}
