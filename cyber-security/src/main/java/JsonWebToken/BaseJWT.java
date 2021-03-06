package JsonWebToken;

// TODO: JWT将Session数据存储在客户端，请求时发送给服务器进行验证(跨域认证?)
// JSON Web Token设计模型:
// 1. 用户使用用户名密码来请求服务器
// 2. 服务器进行验证用户的信息
// 3. 服务器通过验证发送给用户一个token
// 4. 客户端存储token，并在每次请求时附送上这个token值
// 5. 服务端验证token值，并返回数据
public class BaseJWT {

    // 0. jwt在服务器端签发生成
    // 1. 服务端策略: 支持CORS(跨来源资源共享), Access-Control-Allow-Origin: *
    // 2. 服务端私钥secret: 用来进行jwt的签发和jwt的验证，避免泄漏，以免客户端签发有效的jxt，使用有效的Token登录
    // 3. 可以授权token的有效时间，在期间中，始终有效(无法废除)
    // 4. JWT本身包含了认证信息，需要使用https协议传输
}
