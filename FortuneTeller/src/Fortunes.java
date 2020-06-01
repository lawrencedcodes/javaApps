import java.util.Random;

public class Fortunes {
	
	// Hold the fortunes here"",
	static String[] quotes = {
		"Age is an issue of mind over matter. If you don't mind, it doesn't matter.;Mark Twain",
		"Anyone who stops learning is old, whether at twenty or eighty. Anyone who keeps learning stays young. The greatest thing in life is to keep your mind young.;Henry Ford",
		"Wrinkles should merely indicate where smiles have been.;Mark Twain",
		"True terror is to wake up one morning and discover that your high school class is running the country.;Kurt Vonnegut",
		"A diplomat is a man who always remembers a woman's birthday but never remembers her age.;Robert Frost",
		"As I grow older, I pay less attention to what men say. I just watch what they do.;Andrew Carnegie",
		"How incessant and great are the ills with which a prolonged old age is replete.;C. S. Lewis",
		"Old age, believe me, is a good and pleasant thing. It is true you are gently shouldered off the stage, but then you are given such a comfortable front stall as spectator.;Confucius;age",
		"Old age has deformities enough of its own. It should never add to them the deformity of vice.;Eleanor Roosevelt;age",
		"Nobody grows old merely by living a number of years. We grow old by deserting our ideals. Years may wrinkle the skin, but to give up enthusiasm wrinkles the soul.;Samuel Ullman;age",
		"An archaeologist is the best husband a woman can have. The older she gets the more interested he is in her.;Agatha Christie;age",
		"All diseases run into one, old age.;Ralph Waldo Emerson;age",
		"Bashfulness is an ornament to youth, but a reproach to old age.;Aristotle;age",
		"Like everyone else who makes the mistake of getting older, I begin each day with coffee and obituaries.;Bill Cosby;age",
		"Age appears to be best in four things old wood best to burn, old wine to drink, old friends to trust, and old authors to read.;Francis Bacon;age",
		"None are so old as those who have outlived enthusiasm.;Henry David Thoreau;age",
		"Every man over forty is a scoundrel.;George Bernard Shaw;age",
		"Forty is the old age of youth fifty the youth of old age.;Victor Hugo;age",
		"You can't help getting older, but you don't have to get old.;George Burns;age",
		"Alas, after a certain age every man is responsible for his face.;Albert Camus;age"
	};
	public static void main(String[] args) {
		
		// TODO pick a fortune here
		Random random = new Random();
		int r = random.nextInt(quotes.length);
		System.out.println(quotes[r]);

	}

}
