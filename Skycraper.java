package com.greatlearning.group2;

import java.util.*;

public class Skycraper 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the total no of floors in the building : ");
		int n = sc.nextInt();

		int[] floors = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println(" Enter the floor size given on day : " + (i + 1));
			floors[i] = sc.nextInt();
		}

		Arrays.sort(floors);
		List<Integer> assembledFloors = new ArrayList<>();
		for (int i = n - 1; i >= 0; i--) 
		{
			int floorSize = floors[i];
			if (assembledFloors.isEmpty() || assembledFloors.get(assembledFloors.size() - 1) > floorSize) 
			{
				assembledFloors.add(floorSize);
			}
		}

		int day = 1;
		for (int i = n - 1; i >= 0; i--) 
		{
			int floorSize = floors[i];
			System.out.print("Day: " + day + " ");
			if (assembledFloors.contains(floorSize)) 
			{
				System.out.println(floorSize);
				assembledFloors.remove((Object) floorSize);
			}
			else 
			{
				System.out.println();
			}
			day++;
		}
	}
}
