import org.junit.Assert;
import org.junit.Test;

import java.util.StringJoiner;

public class FizzBuzzTest {
    private IFizzBuzz fizzBuzz = new FizzBuzz();


    @Test
    public void FizzBuzz_IsFizz_ShouldBe_true() {
        //Act
        boolean result = fizzBuzz.isFizz(3);

        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void FizzBuzz_IsFizz_ShouldBe_false() {
        //Act
        boolean result = fizzBuzz.isFizz(4);

        //Assert
        Assert.assertFalse(result);
    }

    @Test
    public void FizzBuzz_IsBuzz_ShouldBe_true() {
        //Act
        boolean result = fizzBuzz.isBuzz(5);

        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void FizzBuzz_IsBuzz_ShouldBe_false() {
        //Act
        boolean result = fizzBuzz.isBuzz(7);

        //Assert
        Assert.assertFalse(result);
    }

    @Test
    public void FizzBuzz_IsFizzBuzz_ShouldBe_true() {
        //Act
        boolean result = fizzBuzz.isFizzBuzz(15);

        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void FizzBuzz_IsFizzBuzz_ShouldBe_false() {
        //Act
        boolean result = fizzBuzz.isFizzBuzz(14);

        //Assert
        Assert.assertFalse(result);
    }

    @Test
    public void FizzBuzz_Process_ShouldBe_0() {
        //Act
        String result = fizzBuzz.process(0);

        //Assert
        Assert.assertEquals(0 + "", result);
    }

    @Test
    public void FizzBuzz_Process_ShouldBe_fizz() {
        //Act
        String result = fizzBuzz.process(3);

        //Assert
        Assert.assertEquals(FizzBuzz.FIZZ, result);
    }

    @Test
    public void FizzBuzz_Process_ShouldBe_buzz() {
        //Act
        String result = fizzBuzz.process(5);

        //Assert
        Assert.assertEquals(FizzBuzz.BUZZ, result);
    }

    @Test
    public void FizzBuzz_Process_ShouldBe_fizzbuzz() {
        //Act
        String result = fizzBuzz.process(15);

        //Assert
        Assert.assertEquals(FizzBuzz.FIZZ_BUZZ, result);
    }

    @Test
    public void FizzBuzz_Process_ShouldBe_number() {
        //Act
        int number = 17;
        String result = fizzBuzz.process(number);

        //Assert
        Assert.assertEquals(number + "", result);
    }

    @Test
    public void FizzBuzz_Write_ShouldBe_testString() {
        //Act
        fizzBuzz.initNumbers(17);
        String result = fizzBuzz.write();
        StringJoiner stringJoiner = new StringJoiner("\n");
        stringJoiner.add("1");
        stringJoiner.add("2");
        stringJoiner.add(FizzBuzz.FIZZ);
        stringJoiner.add("4");
        stringJoiner.add(FizzBuzz.BUZZ);
        stringJoiner.add(FizzBuzz.FIZZ);
        stringJoiner.add("7");
        stringJoiner.add("8");
        stringJoiner.add(FizzBuzz.FIZZ);
        stringJoiner.add(FizzBuzz.BUZZ);
        stringJoiner.add("11");
        stringJoiner.add(FizzBuzz.FIZZ);
        stringJoiner.add("13");
        stringJoiner.add("14");
        stringJoiner.add(FizzBuzz.FIZZ_BUZZ);
        stringJoiner.add("16");
        stringJoiner.add("17");

        //Assert
        Assert.assertEquals(stringJoiner.toString(), result);
    }


    @Test
    public void FizzBuzz_WriteLine_ShouldBe_testString() {
        //Act
        fizzBuzz.initRangeOfNumbers(14, 25);
        String result = fizzBuzz.writeLine();

        String testString = "14" +
                FizzBuzz.FIZZ_BUZZ +
                "16" +
                "17" +
                FizzBuzz.FIZZ +
                "19" +
                FizzBuzz.BUZZ +
                FizzBuzz.FIZZ +
                "22" +
                "23" +
                FizzBuzz.FIZZ +
                FizzBuzz.BUZZ;

        //Assert
        Assert.assertEquals(testString, result);
    }


    @Test
    public void FizzBuzz_WriteLine_ShouldBe_testString2() {
        //Act
        fizzBuzz.initRangeOfNumbers(27, 36);
        String result = fizzBuzz.writeLine();
        String testString = FizzBuzz.FIZZ +
                "28" +
                "29" +
                FizzBuzz.FIZZ_BUZZ +
                "31" +
                "32" +
                FizzBuzz.FIZZ +
                "34" +
                FizzBuzz.BUZZ +
                FizzBuzz.FIZZ;

        //Assert
        Assert.assertEquals(testString, result);
    }

}
