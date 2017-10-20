package com.springavanzado.test.contexts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cursospringavanzado.springbusiness.contextos.AppConfig;
import com.cursospringavanzado.springbusiness.contextos.AppContextInit;
import com.cursospringavanzado.springbusiness.contextos.IProfileService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class,
      initializers = AppContextInit.class)
public class ContextsTest {

  @Autowired
  private IProfileService profileService;

  @Test
  public void testDoSomething() {
      String valorRuta = profileService.mostrarRutaFicheroLog();
      System.out.println(valorRuta);
  }
}
