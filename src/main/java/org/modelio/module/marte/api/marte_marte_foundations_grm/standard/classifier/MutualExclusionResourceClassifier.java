/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << MutualExclusionResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MutualExclusionResourceClassifier extends ResourceClassifier {
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_Classifier";

    public static final String MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE = "MutualExclusionResource_Classifier_ceiling";

    public static final String MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_Classifier_otherProtectProtocol";

    public static final String MUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE = "MutualExclusionResource_Classifier_protectKind";

    public static final String MUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE = "MutualExclusionResource_Classifier_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << MutualExclusionResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << MutualExclusionResource_Classifier >> then instantiate a {@link MutualExclusionResourceClassifier} proxy.
     * 
     * @return a {@link MutualExclusionResourceClassifier} proxy on the created {@link Classifier}.
     */
    public static MutualExclusionResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceClassifier.STEREOTYPE_NAME);
        return MutualExclusionResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceClassifier} proxy from a {@link Classifier} stereotyped << MutualExclusionResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link MutualExclusionResourceClassifier} proxy or <i>null</i>.
     */
    public static MutualExclusionResourceClassifier instantiate(final Classifier obj) {
        return MutualExclusionResourceClassifier.canInstantiate(obj) ? new MutualExclusionResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceClassifier} proxy from a {@link Classifier} stereotyped << MutualExclusionResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link MutualExclusionResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MutualExclusionResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (MutualExclusionResourceClassifier.canInstantiate(obj))
        	return new MutualExclusionResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MutualExclusionResourceClassifier other = (MutualExclusionResourceClassifier) obj;
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
     * Getter for string property 'MutualExclusionResource_Classifier_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Classifier_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Classifier_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Classifier_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Classifier_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Classifier_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Classifier_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Classifier_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_Classifier_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Classifier_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Classifier_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Classifier_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Classifier_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Classifier_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Classifier_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Classifier_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT, value);
    }

    protected MutualExclusionResourceClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6a2d2eb9-0f5a-11df-8c52-0014222a9f79");
            MUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "890f2481-0f5a-11df-8c52-0014222a9f79");
            MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a98907f-0f5a-11df-8c52-0014222a9f79");
            MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a60d1ceb-0f5a-11df-8c52-0014222a9f79");
            MUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b118c1df-0f5a-11df-8c52-0014222a9f79");
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
