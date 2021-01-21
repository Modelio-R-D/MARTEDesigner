/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << MutualExclusionResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("79d50cf3-b54b-4b3c-84f3-3a764b589c34")
public class MutualExclusionResourceAssociationEnd extends ResourceAssociationEnd {
    @objid ("6a8d2104-a503-4cfc-90e1-8019d2e0db67")
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_AssociationEnd";

    @objid ("e9c31991-6be3-4e52-8e61-8e0ba1d1ddbc")
    public static final String MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE = "MutualExclusionResource_AssociationEnd_ceiling";

    @objid ("351102cf-5ed6-44cb-8965-09fc3dc1b583")
    public static final String MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_AssociationEnd_otherProtectProtocol";

    @objid ("be69808a-ed13-4239-b2ec-d7bbf88cc2e6")
    public static final String MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE = "MutualExclusionResource_AssociationEnd_protectKind";

    @objid ("6e171baa-78bd-40ff-8063-1a0fa424e2a3")
    public static final String MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE = "MutualExclusionResource_AssociationEnd_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << MutualExclusionResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("672d8ea1-9669-4edd-b90a-2486236ecf95")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << MutualExclusionResource_AssociationEnd >> then instantiate a {@link MutualExclusionResourceAssociationEnd} proxy.
     * 
     * @return a {@link MutualExclusionResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("1b40209b-a38f-4d7c-8182-d747f41bfe27")
    public static MutualExclusionResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceAssociationEnd.STEREOTYPE_NAME);
        return MutualExclusionResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << MutualExclusionResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link MutualExclusionResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("e64a4a4e-f3b4-4029-8bba-f912d7b24daa")
    public static MutualExclusionResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return MutualExclusionResourceAssociationEnd.canInstantiate(obj) ? new MutualExclusionResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << MutualExclusionResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link MutualExclusionResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e7515965-9035-4f08-b912-d9a7ffd55a88")
    public static MutualExclusionResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (MutualExclusionResourceAssociationEnd.canInstantiate(obj))
        	return new MutualExclusionResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("35a4e9c1-4beb-44fe-934d-eeaa85a6d112")
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
        MutualExclusionResourceAssociationEnd other = (MutualExclusionResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("fcc59b6a-3dd7-4a48-9c5f-271c512f5fad")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'MutualExclusionResource_AssociationEnd_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a2ac9f12-7de2-432a-8537-44a39c1f208c")
    public String getMutualExclusionResource_AssociationEnd_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceAssociationEnd.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_AssociationEnd_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3447e79c-8d16-4c1e-8f70-df8a5af6b33c")
    public String getMutualExclusionResource_AssociationEnd_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceAssociationEnd.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_AssociationEnd_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("270f33aa-5380-4d31-8af6-8cfdf5185ffb")
    public String getMutualExclusionResource_AssociationEnd_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceAssociationEnd.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_AssociationEnd_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("18efb640-b74f-42f1-b5b1-70c3e8a3ed10")
    public String getMutualExclusionResource_AssociationEnd_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceAssociationEnd.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("93d1fcd6-ebe2-483d-a62d-6044e58341e4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_AssociationEnd_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b5e126a6-4b51-44c9-9d34-400ca30d7f92")
    public void setMutualExclusionResource_AssociationEnd_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAssociationEnd.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_AssociationEnd_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("71e1ae6d-fdba-4a8c-b2fa-eb9563166291")
    public void setMutualExclusionResource_AssociationEnd_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAssociationEnd.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_AssociationEnd_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7b09e16d-8131-427f-a4da-71ef7ffeb723")
    public void setMutualExclusionResource_AssociationEnd_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAssociationEnd.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_AssociationEnd_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d8adb86-1fc1-4b14-8474-8d6f84163082")
    public void setMutualExclusionResource_AssociationEnd_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAssociationEnd.MdaTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("90a39cfe-5211-4baa-912c-d1d86c9e1a85")
    protected MutualExclusionResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("5435b500-859f-457d-a827-8f680364fc90")
    public static final class MdaTypes {
        @objid ("ddb15050-4ec0-4faa-9519-a45116087a17")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("789503e9-d127-47c6-8340-05359a36fa3a")
        public static TagType MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT;

        @objid ("fafc0c8c-3195-4dd6-b800-a23fe63e6923")
        public static TagType MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT;

        @objid ("330e47df-5da9-40b8-a220-fab87bd474cc")
        public static TagType MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("58a8cf79-b434-4a48-8169-f0c95f646e97")
        public static TagType MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT;

        @objid ("9f8b42aa-c83e-4e8a-becc-862593e5ce51")
        private static Stereotype MDAASSOCDEP;

        @objid ("7415f378-fd9d-4acf-ac38-9ade3341b80c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("240aa214-c967-4133-9d04-a3a2fd906843")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "002a77c4-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002a77cb-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda13-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda1a-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda21-0ccf-11df-8525-001302895b2b");
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
