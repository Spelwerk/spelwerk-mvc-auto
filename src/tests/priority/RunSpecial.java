package tests.priority;

import common.categories.Special;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;

@RunWith(Categories.class)
@Categories.IncludeCategory(Special.class)
@Suite.SuiteClasses({
        //TestName.class
})
public class RunSpecial {}