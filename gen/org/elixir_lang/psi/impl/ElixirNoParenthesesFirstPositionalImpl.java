// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.elixir_lang.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ElixirNoParenthesesFirstPositionalImpl extends ASTWrapperPsiElement implements ElixirNoParenthesesFirstPositional {

  public ElixirNoParenthesesFirstPositionalImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitNoParenthesesFirstPositional(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ElixirAlias getAlias() {
    return findChildByClass(ElixirAlias.class);
  }

  @Override
  @Nullable
  public ElixirAtNumericOperation getAtNumericOperation() {
    return findChildByClass(ElixirAtNumericOperation.class);
  }

  @Override
  @Nullable
  public ElixirAtom getAtom() {
    return findChildByClass(ElixirAtom.class);
  }

  @Override
  @Nullable
  public ElixirAtomKeyword getAtomKeyword() {
    return findChildByClass(ElixirAtomKeyword.class);
  }

  @Override
  @Nullable
  public ElixirBinaryWholeNumber getBinaryWholeNumber() {
    return findChildByClass(ElixirBinaryWholeNumber.class);
  }

  @Override
  @Nullable
  public ElixirCaptureNumericOperation getCaptureNumericOperation() {
    return findChildByClass(ElixirCaptureNumericOperation.class);
  }

  @Override
  @Nullable
  public ElixirCharListHeredoc getCharListHeredoc() {
    return findChildByClass(ElixirCharListHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirCharListLine getCharListLine() {
    return findChildByClass(ElixirCharListLine.class);
  }

  @Override
  @Nullable
  public ElixirCharToken getCharToken() {
    return findChildByClass(ElixirCharToken.class);
  }

  @Override
  @Nullable
  public ElixirDecimalFloat getDecimalFloat() {
    return findChildByClass(ElixirDecimalFloat.class);
  }

  @Override
  @Nullable
  public ElixirDecimalWholeNumber getDecimalWholeNumber() {
    return findChildByClass(ElixirDecimalWholeNumber.class);
  }

  @Override
  @Nullable
  public ElixirEmptyBlock getEmptyBlock() {
    return findChildByClass(ElixirEmptyBlock.class);
  }

  @Override
  @Nullable
  public ElixirHexadecimalWholeNumber getHexadecimalWholeNumber() {
    return findChildByClass(ElixirHexadecimalWholeNumber.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedCharListSigilHeredoc getInterpolatedCharListSigilHeredoc() {
    return findChildByClass(ElixirInterpolatedCharListSigilHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedCharListSigilLine getInterpolatedCharListSigilLine() {
    return findChildByClass(ElixirInterpolatedCharListSigilLine.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedRegexHeredoc getInterpolatedRegexHeredoc() {
    return findChildByClass(ElixirInterpolatedRegexHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedRegexLine getInterpolatedRegexLine() {
    return findChildByClass(ElixirInterpolatedRegexLine.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedSigilHeredoc getInterpolatedSigilHeredoc() {
    return findChildByClass(ElixirInterpolatedSigilHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedSigilLine getInterpolatedSigilLine() {
    return findChildByClass(ElixirInterpolatedSigilLine.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedStringSigilHeredoc getInterpolatedStringSigilHeredoc() {
    return findChildByClass(ElixirInterpolatedStringSigilHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedStringSigilLine getInterpolatedStringSigilLine() {
    return findChildByClass(ElixirInterpolatedStringSigilLine.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedWordsHeredoc getInterpolatedWordsHeredoc() {
    return findChildByClass(ElixirInterpolatedWordsHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirInterpolatedWordsLine getInterpolatedWordsLine() {
    return findChildByClass(ElixirInterpolatedWordsLine.class);
  }

  @Override
  @Nullable
  public ElixirList getList() {
    return findChildByClass(ElixirList.class);
  }

  @Override
  @Nullable
  public ElixirLiteralCharListSigilHeredoc getLiteralCharListSigilHeredoc() {
    return findChildByClass(ElixirLiteralCharListSigilHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirLiteralCharListSigilLine getLiteralCharListSigilLine() {
    return findChildByClass(ElixirLiteralCharListSigilLine.class);
  }

  @Override
  @Nullable
  public ElixirLiteralRegexHeredoc getLiteralRegexHeredoc() {
    return findChildByClass(ElixirLiteralRegexHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirLiteralRegexLine getLiteralRegexLine() {
    return findChildByClass(ElixirLiteralRegexLine.class);
  }

  @Override
  @Nullable
  public ElixirLiteralSigilHeredoc getLiteralSigilHeredoc() {
    return findChildByClass(ElixirLiteralSigilHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirLiteralSigilLine getLiteralSigilLine() {
    return findChildByClass(ElixirLiteralSigilLine.class);
  }

  @Override
  @Nullable
  public ElixirLiteralStringSigilHeredoc getLiteralStringSigilHeredoc() {
    return findChildByClass(ElixirLiteralStringSigilHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirLiteralStringSigilLine getLiteralStringSigilLine() {
    return findChildByClass(ElixirLiteralStringSigilLine.class);
  }

  @Override
  @Nullable
  public ElixirLiteralWordsHeredoc getLiteralWordsHeredoc() {
    return findChildByClass(ElixirLiteralWordsHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirLiteralWordsLine getLiteralWordsLine() {
    return findChildByClass(ElixirLiteralWordsLine.class);
  }

  @Override
  @Nullable
  public ElixirMatchedAdditionOperation getMatchedAdditionOperation() {
    return findChildByClass(ElixirMatchedAdditionOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedAndOperation getMatchedAndOperation() {
    return findChildByClass(ElixirMatchedAndOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedArrowOperation getMatchedArrowOperation() {
    return findChildByClass(ElixirMatchedArrowOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedAtNonNumericOperation getMatchedAtNonNumericOperation() {
    return findChildByClass(ElixirMatchedAtNonNumericOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedCallOperation getMatchedCallOperation() {
    return findChildByClass(ElixirMatchedCallOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedCaptureNonNumericOperation getMatchedCaptureNonNumericOperation() {
    return findChildByClass(ElixirMatchedCaptureNonNumericOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedComparisonOperation getMatchedComparisonOperation() {
    return findChildByClass(ElixirMatchedComparisonOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedDotOperation getMatchedDotOperation() {
    return findChildByClass(ElixirMatchedDotOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedHatOperation getMatchedHatOperation() {
    return findChildByClass(ElixirMatchedHatOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedInMatchOperation getMatchedInMatchOperation() {
    return findChildByClass(ElixirMatchedInMatchOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedInOperation getMatchedInOperation() {
    return findChildByClass(ElixirMatchedInOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedMatchOperation getMatchedMatchOperation() {
    return findChildByClass(ElixirMatchedMatchOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedMultiplicationOperation getMatchedMultiplicationOperation() {
    return findChildByClass(ElixirMatchedMultiplicationOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedOrOperation getMatchedOrOperation() {
    return findChildByClass(ElixirMatchedOrOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedPipeOperation getMatchedPipeOperation() {
    return findChildByClass(ElixirMatchedPipeOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedRelationalOperation getMatchedRelationalOperation() {
    return findChildByClass(ElixirMatchedRelationalOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedTwoOperation getMatchedTwoOperation() {
    return findChildByClass(ElixirMatchedTwoOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedTypeOperation getMatchedTypeOperation() {
    return findChildByClass(ElixirMatchedTypeOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedUnaryNonNumericOperation getMatchedUnaryNonNumericOperation() {
    return findChildByClass(ElixirMatchedUnaryNonNumericOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedWhenOperation getMatchedWhenOperation() {
    return findChildByClass(ElixirMatchedWhenOperation.class);
  }

  @Override
  @Nullable
  public ElixirNoParenthesesKeywords getNoParenthesesKeywords() {
    return findChildByClass(ElixirNoParenthesesKeywords.class);
  }

  @Override
  @Nullable
  public ElixirNoParenthesesNoArgumentsUnqualifiedCallOrVariable getNoParenthesesNoArgumentsUnqualifiedCallOrVariable() {
    return findChildByClass(ElixirNoParenthesesNoArgumentsUnqualifiedCallOrVariable.class);
  }

  @Override
  @Nullable
  public ElixirOctalWholeNumber getOctalWholeNumber() {
    return findChildByClass(ElixirOctalWholeNumber.class);
  }

  @Override
  @Nullable
  public ElixirStringHeredoc getStringHeredoc() {
    return findChildByClass(ElixirStringHeredoc.class);
  }

  @Override
  @Nullable
  public ElixirStringLine getStringLine() {
    return findChildByClass(ElixirStringLine.class);
  }

  @Override
  @Nullable
  public ElixirUnaryNumericOperation getUnaryNumericOperation() {
    return findChildByClass(ElixirUnaryNumericOperation.class);
  }

  @Override
  @Nullable
  public ElixirUnknownBaseWholeNumber getUnknownBaseWholeNumber() {
    return findChildByClass(ElixirUnknownBaseWholeNumber.class);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

}
