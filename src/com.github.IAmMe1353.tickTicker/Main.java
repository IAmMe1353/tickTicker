package com.github.IAmMe1353.tickTicker

import java.nio.files.Paths;
import java.nio.files.Files;
import java.nio.IOException;
import java.nio.file.Paths
import java.util.stream.Stream;

public class Main{
	String[] command;

	public static void main(String[] args) {
		// if flag
		if (arg[0] != null && arg[0].charAt(0).equals("-"){
			// return flag
			if(arg[0].charAt(1).equals("r"){
				pass;
			}

		}
		else pass;
	}

	private String getResponse(String[] args, char flag){
		Runtime runtime = Runtime.getRuntime();
		if (flag != null){
			if (args[1].equals("stocks")){
				//TODO set up stocks
				runtime.exec(new String[]{"tmux", " send-keys", "-t", "session:0.0", "'echo "});
				return null;
			}
			else if (command.contains(args[1]){
				//TODO set up getline
				runtime.exec(new String[]{"tmux","send-keys","-t","session:0.0","'echo " + getLine(args[1]) + "'"});
				return null;
			}
		}
	}
	private void getResponseTypes{
		Path resourcesPath = System.getProperty("tickTicker.resources");
		String fileName;
		// makes an list of all files in resources/
		try (Stream<Path> filePaths = Files.walk(resourcesPath)){
			command = new String[filePaths.count()];
			int i = 0;
			// add names of files to array of possible commands
			filePaths.forEach(path ->{
				fileName = "" + path.getFileName();
				//exclude .txt
				command[i] = filename.substring(0,filename.length()-4)
				i++
			}
		} catch (IOException e) e.printStackTrace();
	}


