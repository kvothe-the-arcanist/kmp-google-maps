import kotlin.test.Test
import kotlin.test.assertEquals

class FibiTest {
    @Test
    fun `test 3rd element`() {
        assertEquals(FirstElement + SecondElement, Fibi.take(3).last())
    }
}
