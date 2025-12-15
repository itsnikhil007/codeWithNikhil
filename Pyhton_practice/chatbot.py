import aiml
import cv2

# Initialize AIML kernel
kernel = aiml.Kernel()
kernel.learn("chatbot.aiml")

def get_response(user_input):
    return kernel.respond(user_input)

def capture_image():
    cap = cv2.VideoCapture(0)
    ret, frame = cap.read()
    if ret:
        cv2.imwrite('captured_image.jpg', frame)
    cap.release()
    cv2.destroyAllWindows()

def main():
    while True:
        user_input = input("You: ")
        if user_input.lower() == "capture image":
            capture_image()
            print("Image captured.")
        else:
            response = get_response(user_input)
            print("Bot:", response)

if __name__ == "__main__":
    main()
