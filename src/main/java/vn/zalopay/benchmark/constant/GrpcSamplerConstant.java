package vn.zalopay.benchmark.constant;

/**
 * GrpcSampler constant definition
 *
 * @author ylyue
 * @since 2022/7/11
 */
public class GrpcSamplerConstant {
    private GrpcSamplerConstant() {
        throw new IllegalStateException("Constant class");
    }

    /** Client exception message - http 400 */
    public static final String CLIENT_EXCEPTION_MSG =
            " GRPCSampler parsing exception: An unknown exception occurred before the GRPC request"
                    + " was initiated, See response body for the stack trace.";

    public static final String CALL_TYPE_UNARY = "unary";
    public static final String CALL_TYPE_SERVER_STREAMING = "server-streaming";
    public static final String CALL_TYPE_CLIENT_STREAMING = "client-streaming";
    public static final String CALL_TYPE_BIDI_STREAMING = "bidi-streaming";
}
