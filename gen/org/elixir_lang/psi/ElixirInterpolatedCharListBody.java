// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ElixirInterpolatedCharListBody extends Body {

  @NotNull
  List<ElixirEscapedCharacter> getEscapedCharacterList();

  @NotNull
  List<ElixirEscapedEOL> getEscapedEOLList();

  @NotNull
  List<ElixirHexadecimalEscapeSequence> getHexadecimalEscapeSequenceList();

  @NotNull
  List<ElixirInterpolation> getInterpolationList();

}
