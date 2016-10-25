package org.ConfigService;



public enum SystemConfig {
	CPS_MONITOR_ENABLED(Type.DEFAULT,0);

	public enum Type{
		DEFAULT,
		Log

	}
	private SystemConfig.Type DefaultType;
	private int DefaultValue;
	SystemConfig(final Type type,final int value)
	{
		DefaultType = type;
		DefaultValue = value;
	}
	public	enum LogLevel{
		SEVERE(1), WARNING(2), INFO(3), FINE(4), FINER(5), FINEST(6);

		private int level;

		LogLevel(final int level)
		{
			this.level = level;
		}

		public int getLevel()
		{
			return level;
		}

		public static LogLevel valueByInt(final int level)
		{
			for (final LogLevel log : values())
			{
				if (level == log.level)
				{
					return log;
				}
			}
			throw new IllegalArgumentException(level + " is not a recognized value.");
		}

		public static LogLevel valueByString(final String name)
		{
			if (name.length() == 1)
			{
				// try by converting string to level
				try
				{
					final int level = Integer.valueOf(name);
					final LogLevel log = valueByInt(level);
					if (log != null)
					{
						return log;
					}
				}
				catch (final NumberFormatException nfe)
				{
					// ignore
				}
			}
			// if we get here, try by name
			return valueOf(name);
		}
	}

}
