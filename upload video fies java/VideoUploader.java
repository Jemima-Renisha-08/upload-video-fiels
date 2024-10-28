import java.util.Scanner;

public class VideoUploader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Supported video file extensions
        String[] supportedFormats = {".mp4", ".avi", ".mov", ".mkv"};

        // Prompt user to enter the file name
        System.out.print("Enter the name of the video file you want to upload (with extension): ");
        String fileName = scanner.nextLine();

        // Check if the file is a valid video format
        boolean isValidFormat = false;
        for (String format : supportedFormats) {
            if (fileName.toLowerCase().endsWith(format)) {
                isValidFormat = true;
                break;
            }
        }

        // Display message based on file type
        if (isValidFormat) {
            System.out.println("Uploading video file: " + fileName + "...");
            System.out.println("Upload successful!");
        } else {
            System.out.println("Error: The file you entered is not a supported video format.");
            System.out.println("Please upload a video file with one of the following extensions: .mp4, .avi, .mov, .mkv");
        }

        scanner.close();
    }
}
