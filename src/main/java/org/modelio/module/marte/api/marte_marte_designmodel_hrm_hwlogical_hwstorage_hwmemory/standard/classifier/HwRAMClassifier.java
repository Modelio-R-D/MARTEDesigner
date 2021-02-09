/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwRAM_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwRAMClassifier extends HwMemoryClassifier {
    public static final String STEREOTYPE_NAME = "HwRAM_Classifier";

    public static final String HWRAM_CLASSIFIER_ISNONVOLATILE_TAGTYPE = "HwRAM_Classifier_isNonVolatile";

    public static final String HWRAM_CLASSIFIER_ISSTATIC_TAGTYPE = "HwRAM_Classifier_isStatic";

    public static final String HWRAM_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Classifier_isSynchronous";

    public static final String HWRAM_CLASSIFIER_ORGANIZATION_TAGTYPE = "HwRAM_Classifier_organization";

    public static final String HWRAM_CLASSIFIER_REPL_POLICY_TAGTYPE = "HwRAM_Classifier_repl_Policy";

    public static final String HWRAM_CLASSIFIER_WRITEPOLICY_TAGTYPE = "HwRAM_Classifier_writePolicy";

    /**
     * Tells whether a {@link HwRAMClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwRAM_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwRAM_Classifier >> then instantiate a {@link HwRAMClassifier} proxy.
     * 
     * @return a {@link HwRAMClassifier} proxy on the created {@link Classifier}.
     */
    public static HwRAMClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMClassifier.STEREOTYPE_NAME);
        return HwRAMClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMClassifier} proxy from a {@link Classifier} stereotyped << HwRAM_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwRAMClassifier} proxy or <i>null</i>.
     */
    public static HwRAMClassifier instantiate(final Classifier obj) {
        return HwRAMClassifier.canInstantiate(obj) ? new HwRAMClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwRAMClassifier} proxy from a {@link Classifier} stereotyped << HwRAM_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwRAMClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwRAMClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwRAMClassifier.canInstantiate(obj))
        	return new HwRAMClassifier(obj);
        else
        	throw new IllegalArgumentException("HwRAMClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwRAMClassifier other = (HwRAMClassifier) obj;
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
     * Getter for string property 'HwRAM_Classifier_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Classifier_organization() {
        return this.elt.getTagValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Classifier_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Classifier_repl_Policy() {
        return this.elt.getTagValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Classifier_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwRAM_Classifier_writePolicy() {
        return this.elt.getTagValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Classifier_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Classifier_isNonVolatile() {
        return this.elt.isTagged(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Classifier_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Classifier_isStatic() {
        return this.elt.isTagged(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Classifier_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwRAM_Classifier_isSynchronous() {
        return this.elt.isTagged(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Classifier_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Classifier_isNonVolatile(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISNONVOLATILE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Classifier_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Classifier_isStatic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISSTATIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Classifier_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Classifier_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwRAM_Classifier_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Classifier_organization(final String value) {
        this.elt.putTagValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Classifier_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Classifier_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Classifier_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwRAM_Classifier_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    protected HwRAMClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRAM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT;

        public static TagType HWRAM_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT;

        public static TagType HWRAM_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT;

        public static TagType HWRAM_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT;

        public static TagType HWRAM_CLASSIFIER_ISSTATIC_TAGTYPE_ELT;

        public static TagType HWRAM_CLASSIFIER_ISNONVOLATILE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "264b462f-1007-11df-86fe-0014222a9f79");
            HWRAM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "334ba953-1007-11df-86fe-0014222a9f79");
            HWRAM_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "334ba957-1007-11df-86fe-0014222a9f79");
            HWRAM_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "334ba958-1007-11df-86fe-0014222a9f79");
            HWRAM_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c6027159-170f-11df-b92a-0014222a9f79");
            HWRAM_CLASSIFIER_ISSTATIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c604d3b5-170f-11df-b92a-0014222a9f79");
            HWRAM_CLASSIFIER_ISNONVOLATILE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c604d3b6-170f-11df-b92a-0014222a9f79");
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
