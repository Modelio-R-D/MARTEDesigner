/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("133a8b94-6941-416e-a872-8a839400e279")
public class MutualExclusionResourceClassifier extends ResourceClassifier {
    @objid ("15b04a08-236f-4af9-a5d5-34b491d2f7b7")
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_Classifier";

    @objid ("d155356e-043a-4c6e-813c-4801a97871d0")
    public static final String MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE = "MutualExclusionResource_Classifier_ceiling";

    @objid ("8f9fd86d-6c43-440e-b46c-31d19f46098b")
    public static final String MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_Classifier_otherProtectProtocol";

    @objid ("32d2ae32-93b6-4b71-abc1-f2102cb4d40c")
    public static final String MUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE = "MutualExclusionResource_Classifier_protectKind";

    @objid ("e9b58a31-3c63-420c-81d0-27ce8db43f05")
    public static final String MUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE = "MutualExclusionResource_Classifier_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << MutualExclusionResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a9f78631-e3f1-473c-84c9-7bf55d1869ae")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << MutualExclusionResource_Classifier >> then instantiate a {@link MutualExclusionResourceClassifier} proxy.
     * 
     * @return a {@link MutualExclusionResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("2146d57f-872c-41b8-a563-572ae315695f")
    public static MutualExclusionResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceClassifier.STEREOTYPE_NAME);
        return MutualExclusionResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceClassifier} proxy from a {@link Classifier} stereotyped << MutualExclusionResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link MutualExclusionResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("60274e26-3d5f-4e95-9a5c-09ace3b23bde")
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
    @objid ("e99b1078-6bc4-4130-a01d-0a1c4b254e35")
    public static MutualExclusionResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (MutualExclusionResourceClassifier.canInstantiate(obj))
        	return new MutualExclusionResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("71259a4f-2bd4-4aa3-b948-1abb5823bbe2")
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
    @objid ("ebd4cac9-025a-4186-abd8-600ce656dcdc")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'MutualExclusionResource_Classifier_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6c4658ac-a24d-43dc-b3ba-f6c0cdd93909")
    public String getMutualExclusionResource_Classifier_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Classifier_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("628242aa-ca09-4bce-acbf-6ff35c0aed1f")
    public String getMutualExclusionResource_Classifier_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Classifier_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cc22dfbb-38bd-4621-93d2-dc81048ef72f")
    public String getMutualExclusionResource_Classifier_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Classifier_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b7481814-79d5-4fa0-aaf2-38de93fba5df")
    public String getMutualExclusionResource_Classifier_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("47997fa1-5cfd-45f1-8424-29b8c4696aa2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_Classifier_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2f67c0f-b86e-44dd-8981-b508aca87b9c")
    public void setMutualExclusionResource_Classifier_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Classifier_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34cfd515-4bc8-410b-b21f-a89ab2bfbcbd")
    public void setMutualExclusionResource_Classifier_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Classifier_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ddabc9b1-8717-4443-a884-a6a6e485d2ad")
    public void setMutualExclusionResource_Classifier_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Classifier_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f5060b55-ab8b-42d1-9551-261b37a72deb")
    public void setMutualExclusionResource_Classifier_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceClassifier.MdaTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("ff1f5155-444f-4dcd-9ddb-8512c65834a0")
    protected MutualExclusionResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("5fed3955-d2ac-4cf4-b80b-16e1231811ba")
    public static final class MdaTypes {
        @objid ("617d8c43-5441-44eb-ab62-99ad60b2354c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("898a6ee7-ebf3-429b-af19-b67286ffb65d")
        public static TagType MUTUALEXCLUSIONRESOURCE_CLASSIFIER_PROTECTKIND_TAGTYPE_ELT;

        @objid ("20663e3b-df41-44a7-bb4d-47e291382a21")
        public static TagType MUTUALEXCLUSIONRESOURCE_CLASSIFIER_CEILING_TAGTYPE_ELT;

        @objid ("035bb7a8-3867-4369-933a-299e9bd93d18")
        public static TagType MUTUALEXCLUSIONRESOURCE_CLASSIFIER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("e78c363e-6d29-4923-9579-43c7dfeef9c1")
        public static TagType MUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER_TAGTYPE_ELT;

        @objid ("9ae73763-0dfa-4b82-b895-3d92af37f67a")
        private static Stereotype MDAASSOCDEP;

        @objid ("62335c34-038f-40c6-874e-8c9adaf8a198")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("affb063c-9338-412f-b753-ee4945a4478e")
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
