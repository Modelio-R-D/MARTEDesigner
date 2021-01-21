/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
@objid ("61ac0948-aed6-4731-9a21-e8f2db98744c")
public class MutualExclusionResourceAssociation extends ResourceAssociation {
    @objid ("ce257cfc-4fc9-484d-b471-62bfc7361518")
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_Association";

    @objid ("52d92a7c-e1fb-4ebd-b90f-04f836e4115e")
    public static final String MUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE = "MutualExclusionResource_Association_ceiling";

    @objid ("2627dcaa-d496-43cd-b501-77a9bc48085e")
    public static final String MUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_Association_otherProtectProtocol";

    @objid ("6644fe10-9173-4abc-9931-6a2b20a869d9")
    public static final String MUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE = "MutualExclusionResource_Association_protectKind";

    @objid ("785ce3e1-3838-4e84-a160-b8ac08aa1756")
    public static final String MUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE = "MutualExclusionResource_Association_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << MutualExclusionResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7fcdf017-5610-4111-8383-845f7f763922")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << MutualExclusionResource_Association >> then instantiate a {@link MutualExclusionResourceAssociation} proxy.
     * 
     * @return a {@link MutualExclusionResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("3a52ee63-2d31-4fe9-a794-197320529b4b")
    public static MutualExclusionResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceAssociation.STEREOTYPE_NAME);
        return MutualExclusionResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceAssociation} proxy from a {@link Association} stereotyped << MutualExclusionResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link MutualExclusionResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("493c42fd-ed7c-4d6e-81bf-10a4e35a7e6d")
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
    @objid ("dddaeb60-72c2-446a-b1fc-72f6de4b6042")
    public static MutualExclusionResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (MutualExclusionResourceAssociation.canInstantiate(obj))
        	return new MutualExclusionResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0e8e1b8b-a60a-4cc7-936d-966ea97875cc")
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
    @objid ("39c51988-e7c2-4733-9cd7-2b88765398c3")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'MutualExclusionResource_Association_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bdde72f5-088a-422a-9f71-f7d37b499ffc")
    public String getMutualExclusionResource_Association_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Association_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("05b9eae3-d99a-48ba-b1a2-6db3cf2af335")
    public String getMutualExclusionResource_Association_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Association_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e9568bd4-3935-407e-a9af-8d69d0779817")
    public String getMutualExclusionResource_Association_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Association_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("54f2bbb0-97ce-458b-bb20-8e9967b7a661")
    public String getMutualExclusionResource_Association_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("5e7b12a5-b988-4a9c-8ea6-e75ac9b93874")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_Association_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58624959-99c9-4f1f-a43e-82226f791146")
    public void setMutualExclusionResource_Association_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Association_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3a9d32bd-a5ce-479d-a4b7-ccc22ecabab9")
    public void setMutualExclusionResource_Association_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Association_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6614753d-4f0c-4eda-91f4-a99b2e407735")
    public void setMutualExclusionResource_Association_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Association_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("662c065c-a47c-446d-9021-d635af4b5259")
    public void setMutualExclusionResource_Association_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAssociation.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("1a72f74b-66f7-41dd-bfd7-7aff14c52d52")
    protected MutualExclusionResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("3489e820-380f-49e3-b51b-a61d24ec0aaf")
    public static final class MdaTypes {
        @objid ("2791a205-939c-4b26-b14f-f2e86b19c6e0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("768bf6b7-0c06-4be0-85c5-6c687703a6a7")
        public static TagType MUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND_TAGTYPE_ELT;

        @objid ("76ec59e6-ac94-4717-8687-b167a7c76ae9")
        public static TagType MUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING_TAGTYPE_ELT;

        @objid ("4a0135d1-bf39-42fa-a6f3-f3834512596a")
        public static TagType MUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("e615e242-6d2f-4ee5-be48-93073eee702c")
        public static TagType MUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER_TAGTYPE_ELT;

        @objid ("a4915230-ab5f-4144-92e4-74b910499b2e")
        private static Stereotype MDAASSOCDEP;

        @objid ("5ce3e7b1-baa2-4dd6-b0f7-1e0a800dbc57")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e00b1a17-a1c4-44e9-80d5-a29584522a13")
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
