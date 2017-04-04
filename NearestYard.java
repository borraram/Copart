import java.util.*;
import java.lang.*;
import java.io.*;

class NearestYard
{
	public static void main (String[] args)
	{
		System.out.println(distance(18.49352, -67.135883, 18.172947, -66.944111) + " Miles\n");
		//we can implement K nearest neighbour Algorithm an unsupervised learning technique to find the nearest possisble
	}

	private static double distance(double l1, double lon1, double l2, double lon2) {
		double theta = lon1 - lon2;
		double dist = Math.sin(deg2rad(l1)) * Math.sin(deg2rad(l2)) + Math.cos(deg2rad(l1)) * Math.cos(deg2rad(l2)) * Math.cos(deg2rad(theta));
		//calculing the distance using Math.acos() to convert co-ordinates to radians then to degrees
		dist = rad2deg(Math.acos(dist))* 60 * 1.1515;
		return dist;
	}

	//converting decimal degrees to radians
	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}

    //converting radians to decimal degrees
	private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}
}