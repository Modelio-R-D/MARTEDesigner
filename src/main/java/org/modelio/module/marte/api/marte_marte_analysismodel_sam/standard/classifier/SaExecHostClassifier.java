/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier.GaExecHostClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SaExecHost_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaExecHostClassifier extends GaExecHostClassifier {
    public static final String STEREOTYPE_NAME = "SaExecHost_Classifier";

    public static final String SAEXECHOST_CLASSIFIER_ISRPRIORANGE_TAGTYPE = "SaExecHost_Classifier_ISRprioRange";

    public static final String SAEXECHOST_CLASSIFIER_ISRSWITCHT_TAGTYPE = "SaExecHost_Classifier_ISRswitchT";

    public static final String SAEXECHOST_CLASSIFIER_ISSCHED_TAGTYPE = "SaExecHost_Classifier_isSched";

    public static final String SAEXECHOST_CLASSIFIER_SCHSLACK_TAGTYPE = "SaExecHost_Classifier_schSlack";

    public static final String SAEXECHOST_CLASSIFIER_SCHEDUTILIZ_TAGTYPE = "SaExecHost_Classifier_schedUtiliz";

    /**
     * Tells whether a {@link SaExecHostClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SaExecHost_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SaExecHost_Classifier >> then instantiate a {@link SaExecHostClassifier} proxy.
     * 
     * @return a {@link SaExecHostClassifier} proxy on the created {@link Classifier}.
     */
    public static SaExecHostClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostClassifier.STEREOTYPE_NAME);
        return SaExecHostClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SaExecHostClassifier} proxy from a {@link Classifier} stereotyped << SaExecHost_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SaExecHostClassifier} proxy or <i>null</i>.
     */
    public static SaExecHostClassifier instantiate(final Classifier obj) {
        return SaExecHostClassifier.canInstantiate(obj) ? new SaExecHostClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaExecHostClassifier} proxy from a {@link Classifier} stereotyped << SaExecHost_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SaExecHostClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaExecHostClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SaExecHostClassifier.canInstantiate(obj))
        	return new SaExecHostClassifier(obj);
        else
        	throw new IllegalArgumentException("SaExecHostClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SaExecHostClassifier other = (SaExecHostClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'SaExecHost_Classifier_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaExecHost_Classifier_ISRprioRange() {
        return this.elt.getTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_ISRPRIORANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Classifier_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaExecHost_Classifier_ISRswitchT() {
        return this.elt.getTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_ISRSWITCHT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Classifier_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaExecHost_Classifier_schSlack() {
        return this.elt.getTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Classifier_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaExecHost_Classifier_schedUtiliz() {
        return this.elt.getTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_SCHEDUTILIZ_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaExecHost_Classifier_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaExecHost_Classifier_isSched() {
        return this.elt.isTagged(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Classifier_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_Classifier_ISRprioRange(final String value) {
        this.elt.putTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_ISRPRIORANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Classifier_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_Classifier_ISRswitchT(final String value) {
        this.elt.putTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_ISRSWITCHT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaExecHost_Classifier_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_Classifier_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Classifier_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_Classifier_schSlack(final String value) {
        this.elt.putTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Classifier_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_Classifier_schedUtiliz(final String value) {
        this.elt.putTagValue(SaExecHostClassifier.MdaTypes.SAEXECHOST_CLASSIFIER_SCHEDUTILIZ_TAGTYPE_ELT, value);
    }

    protected SaExecHostClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SAEXECHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT;

        public static TagType SAEXECHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT;

        public static TagType SAEXECHOST_CLASSIFIER_SCHEDUTILIZ_TAGTYPE_ELT;

        public static TagType SAEXECHOST_CLASSIFIER_ISRSWITCHT_TAGTYPE_ELT;

        public static TagType SAEXECHOST_CLASSIFIER_ISRPRIORANGE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f89914f3-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_CLASSIFIER_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f89914f4-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_CLASSIFIER_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f89914f5-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_CLASSIFIER_SCHEDUTILIZ_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f89914f6-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_CLASSIFIER_ISRSWITCHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f89914f7-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_CLASSIFIER_ISRPRIORANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f89914f8-14ad-11df-9d54-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
