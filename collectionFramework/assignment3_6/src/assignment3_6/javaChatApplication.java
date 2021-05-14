package assignment3_6;
import java.util.Scanner;
import java.util.Vector;

public class javaChatApplication {
	public static int charRoomCount =0;
	
	public static javaChatRoom searchjavaChatRoom(Vector<javaChatRoom> roomlist, String roomName){
		javaChatRoom foundjavaChatRoom = null;
		//System.out.println("Size is" + roomlist.size());
		for(int i=0;i<roomlist.size();i++) {
			if(roomlist.get(i).name.equals(roomName)) {
				foundjavaChatRoom = roomlist.get(i);
				break;
			}
		}
		return foundjavaChatRoom;
	}
	public static void deletejavaChatRoom(Vector<javaChatRoom> roomlist, String roomName) {
		for(int i=0;i<roomlist.size();i++) {
			if(roomlist.get(i).name.equals(roomName)) {
				roomlist.remove(i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		  Vector<javaChatRoom> roomlist = new Vector<javaChatRoom>();
		
		while(true){
			System.out.println("1 for Create a chatroom");
			System.out.println("2 for Add the user");
			System.out.println("3 Enter Into javaChatRoom");
			System.out.println("4 for Display the messages from a specific chatroom");
			System.out.println("5 for List down all users belonging to the specified chat room");
			System.out.println("6 for Delete an user");
			System.out.println("7 for Delete the chat room.");
			System.out.println("Please enter your option:");
			switch(Integer.parseInt(scan.nextLine())){
			case 1:
				System.out.println("Enter javaChatRoom name:");
				javaChatRoom newRoom = new javaChatRoom(scan.nextLine());
				//System.out.println(newRoom.name);
				roomlist.add(newRoom);
				System.out.println("javaChatRoom Added");
			break;
			case 2:
				System.out.println("Enter user name:");
				String username2 = scan.nextLine();
				System.out.println("Enter password:");
				String password2 = scan.nextLine();
				System.out.println("Enter Chatroom name where user to be added:");
				String chatroom2 = scan.nextLine();
				javaChatRoom foundRoom2 = searchjavaChatRoom(roomlist,chatroom2);
				//System.out.println(foundRoom2.name);
				if(foundRoom2 instanceof javaChatRoom)
					foundRoom2.addUser(username2, password2);
				else
					System.out.println("user  not added");
			break;
			case 3:
				System.out.println("Enter javaChatRoom name:");
				String chatroom3 = scan.nextLine();
				javaChatRoom foundRoom3 = searchjavaChatRoom(roomlist,chatroom3);
				System.out.println("Enter user name:");
				String username3 = scan.nextLine();
				System.out.println("Enter password:");
				String password3 = scan.nextLine();
				if(foundRoom3 instanceof javaChatRoom) {
					boolean cond = foundRoom3.checkCredentials(username3,password3);
					if(cond){
						System.out.println("User Looged in");
						login:while(true) {
							System.out.println("1 for Send a message");
							System.out.println("2 for Logout");
							switch(Integer.parseInt(scan.nextLine())){
							case 1:
								System.out.println("Enter Message:");
								String message = scan.nextLine();
								foundRoom3.addMessage(message);
								System.out.println("Message Added");
							break;
							case 2:
								break login;
							}
						}
					}
					else
						System.out.println("Wrong Credentials");
				}
			break;
			case 4:
				System.out.println("Enter javaChatRoom name:");
				String chatroom4 = scan.nextLine();
				javaChatRoom foundRoom4 = searchjavaChatRoom(roomlist,chatroom4);
				if(foundRoom4 instanceof javaChatRoom) {
					System.out.println(chatroom4 + "Messages");
					foundRoom4.displayMessages();
				}
				else{
					System.out.println("No javaChatRoom Exist");
				}
			break;
			case 5:
				System.out.println("Enter javaChatRoom name:");
				String chatroom5 = scan.nextLine();
				javaChatRoom foundRoom5 = searchjavaChatRoom(roomlist,chatroom5);
				if(foundRoom5 instanceof javaChatRoom){
					System.out.println("User's list");
					foundRoom5.displayUser();
				}
				else
					System.out.println("user list not printed");
				break;
			case 6:
				System.out.println("Enter user name:");
				String username6 = scan.nextLine();
				System.out.println("Enter password:");
				String password6 = scan.nextLine();
				System.out.println("Enter javaChatRoom name:");
				String chatroom6 = scan.nextLine();
				javaChatRoom foundRoom6 = searchjavaChatRoom(roomlist,chatroom6);
				if(foundRoom6 instanceof javaChatRoom) {
					foundRoom6.removeUser(username6);
				}
			break;
			case 7:
				System.out.println("Enter javaChatRoom name:");
				String chatroom7 = scan.nextLine();
				System.out.println("javaChatRoom Deleted");
			break;
			}
		}
	}

}