/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class MutualExclusionResourceLifeline extends ResourceLifeline {
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_Lifeline";

    public static final String MUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE = "MutualExclusionResource_Lifeline_ceiling";

    public static final String MUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_Lifeline_otherProtectProtocol";

    public static final String MUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE = "MutualExclusionResource_Lifeline_protectKind";

    public static final String MUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE = "MutualExclusionResource_Lifeline_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << MutualExclusionResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << MutualExclusionResource_Lifeline >> then instantiate a {@link MutualExclusionResourceLifeline} proxy.
     * 
     * @return a {@link MutualExclusionResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static MutualExclusionResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceLifeline.STEREOTYPE_NAME);
        return MutualExclusionResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceLifeline} proxy from a {@link Lifeline} stereotyped << MutualExclusionResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link MutualExclusionResourceLifeline} proxy or <i>null</i>.
     */
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
    public static MutualExclusionResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (MutualExclusionResourceLifeline.canInstantiate(obj))
        	return new MutualExclusionResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MutualExclusionResourceLifeline other = (MutualExclusionResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'MutualExclusionResource_Lifeline_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Lifeline_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Lifeline_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Lifeline_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Lifeline_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Lifeline_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Lifeline_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Lifeline_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_Lifeline_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Lifeline_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Lifeline_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Lifeline_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Lifeline_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Lifeline_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Lifeline_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Lifeline_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceLifeline.MdaTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT, value);
    }

    protected MutualExclusionResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND_TAGTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING_TAGTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
