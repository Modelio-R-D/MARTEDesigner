/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << MutualExclusionResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fbe48624-922f-46d4-bb49-b6857ab2d2af")
public class MutualExclusionResourceLifeline extends ResourceLifeline {
    @objid ("bd963ca2-e631-431d-9a1b-ddc7f364d61f")
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_Lifeline";

    @objid ("ffdf7b35-678f-4315-b5f4-762d4c72c980")
    public static final String MUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE = "MutualExclusionResource_Lifeline_ceiling";

    @objid ("ea4eb466-8a39-49c7-9a0a-1e53b3c37a31")
    public static final String MUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_Lifeline_otherProtectProtocol";

    @objid ("75862de4-c7bd-46fc-a65f-9d910b8e123b")
    public static final String MUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE = "MutualExclusionResource_Lifeline_protectKind";

    @objid ("a3570234-344b-46f8-9760-5cfd89a3ce8f")
    public static final String MUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE = "MutualExclusionResource_Lifeline_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << MutualExclusionResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4f230348-c23c-45e2-a01d-45d53bdf4a04")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << MutualExclusionResource_Lifeline >> then instantiate a {@link MutualExclusionResourceLifeline} proxy.
     * 
     * @return a {@link MutualExclusionResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("a59c106f-2589-4edd-88f5-a28b32938fad")
    public static MutualExclusionResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceLifeline.STEREOTYPE_NAME);
        return MutualExclusionResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceLifeline} proxy from a {@link Lifeline} stereotyped << MutualExclusionResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link MutualExclusionResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("224a51b0-565f-45b8-b4e7-668eb66d6a6d")
    public static MutualExclusionResourceLifeline instantiate(final Lifeline obj) {
        return MutualExclusionResourceLifeline.canInstantiate(obj) ? new MutualExclusionResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceLifeline} proxy from a {@link Lifeline} stereotyped << MutualExclusionResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link MutualExclusionResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("18fe885a-95d0-41c7-b821-4983150a0d91")
    public static MutualExclusionResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (MutualExclusionResourceLifeline.canInstantiate(obj))
        	return new MutualExclusionResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f50da932-61dd-4204-b3ab-34d0ae0404d6")
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
        MutualExclusionResourceLifeline other = (MutualExclusionResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("e5f764a2-48a8-4930-a4f4-bb61377e9caf")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'MutualExclusionResource_Lifeline_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b37e2224-d618-49ea-a019-6b327826d368")
    public String getMutualExclusionResource_Lifeline_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Lifeline_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("152eca31-dfd8-42ac-b0ef-228a2a653dd8")
    public String getMutualExclusionResource_Lifeline_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Lifeline_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e447fdb0-4e20-4555-a296-0da41c3edd97")
    public String getMutualExclusionResource_Lifeline_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Lifeline_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e44898a-8806-441d-9930-e18668c59851")
    public String getMutualExclusionResource_Lifeline_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("fa6aaede-1b96-4890-9168-b4b752570388")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_Lifeline_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("afff97b9-9c92-4228-816f-571ee04657c0")
    public void setMutualExclusionResource_Lifeline_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Lifeline_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db254a56-12e4-46b7-91ec-fa63bc4443c9")
    public void setMutualExclusionResource_Lifeline_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Lifeline_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f8d1132-77d0-4d16-805b-f703e53f3894")
    public void setMutualExclusionResource_Lifeline_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Lifeline_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3c200d89-7f79-4d1c-a824-ed6f90e88f7b")
    public void setMutualExclusionResource_Lifeline_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("8df1bdfd-8fc9-4332-bdf0-5e4d38851f8a")
    protected MutualExclusionResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("495cee64-d786-4008-bc80-a244c687d739")
    public static final class MdaTypes {
        @objid ("c4dba12d-9676-49b4-ac38-a05104fa7452")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("68cbfc2a-0507-4a85-beb2-b78eba0ae53f")
        public static TagType MUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT;

        @objid ("fd05e799-1f07-4cbc-89d9-f0fec547cae3")
        public static TagType MUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT;

        @objid ("7d28bd6e-53ff-4d1f-8856-a9f9d3c9f3d7")
        public static TagType MUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("97aa51e4-9dd4-41bf-98a4-0758f59c0fc7")
        public static TagType MUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT;

        @objid ("cf9ceb76-fe7e-4d04-af7f-690c4f6d2349")
        private static Stereotype MDAASSOCDEP;

        @objid ("8fcaf553-1318-4c55-a55e-6e84c6846505")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eea448dc-edfa-47c1-95a5-aca80127a38c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5fe50a99-0f5a-11df-8c52-0014222a9f79");
            MUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "87d46e19-0f5a-11df-8c52-0014222a9f79");
            MUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9970ece7-0f5a-11df-8c52-0014222a9f79");
            MUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a4f88c23-0f5a-11df-8c52-0014222a9f79");
            MUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "af98e745-0f5a-11df-8c52-0014222a9f79");
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
