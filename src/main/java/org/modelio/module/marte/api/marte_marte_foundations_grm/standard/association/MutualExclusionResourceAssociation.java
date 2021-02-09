/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << MutualExclusionResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class MutualExclusionResourceAssociation extends ResourceAssociation {
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_Association";

    public static final String MUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE = "MutualExclusionResource_Association_ceiling";

    public static final String MUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_Association_otherProtectProtocol";

    public static final String MUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE = "MutualExclusionResource_Association_protectKind";

    public static final String MUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE = "MutualExclusionResource_Association_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << MutualExclusionResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << MutualExclusionResource_Association >> then instantiate a {@link MutualExclusionResourceAssociation} proxy.
     * 
     * @return a {@link MutualExclusionResourceAssociation} proxy on the created {@link Association}.
     */
    public static MutualExclusionResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceAssociation.STEREOTYPE_NAME);
        return MutualExclusionResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceAssociation} proxy from a {@link Association} stereotyped << MutualExclusionResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link MutualExclusionResourceAssociation} proxy or <i>null</i>.
     */
    public static MutualExclusionResourceAssociation instantiate(final Association obj) {
        return MutualExclusionResourceAssociation.canInstantiate(obj) ? new MutualExclusionResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceAssociation} proxy from a {@link Association} stereotyped << MutualExclusionResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link MutualExclusionResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MutualExclusionResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (MutualExclusionResourceAssociation.canInstantiate(obj))
        	return new MutualExclusionResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MutualExclusionResourceAssociation other = (MutualExclusionResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'MutualExclusionResource_Association_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Association_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Association_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Association_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Association_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Association_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Association_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMutualExclusionResource_Association_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_Association_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Association_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Association_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Association_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Association_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Association_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Association_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMutualExclusionResource_Association_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE_ELT, value);
    }

    protected MutualExclusionResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        public static TagType MUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "586827f1-0f5a-11df-8c52-0014222a9f79");
            MUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "868b6995-0f5a-11df-8c52-0014222a9f79");
            MUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9820c155-0f5a-11df-8c52-0014222a9f79");
            MUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a3d5ad3f-0f5a-11df-8c52-0014222a9f79");
            MUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ae7d2f6f-0f5a-11df-8c52-0014222a9f79");
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
