		Scanner scan = new Scanner(System.in);

		
		String s = scan.nextLine();

	
		scan.close();

		
		double value = Double.parseDouble(s);
	
		double valueRadians = Math.toRadians(value);

		
		double sineValue = Math.sin(valueRadians);
		System.out.println( sineValue);

	}
}
