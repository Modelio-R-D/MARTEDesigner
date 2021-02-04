/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link AssociationEnd} with << SharedDataComResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e808cb00-9e19-432a-b911-8cfdb4b304e6")
public class SharedDataComResourceAssociationEnd extends SwCommunicationResourceAssociationEnd {
    @objid ("42b49ecd-8e2a-4b2f-a4e7-ee2d70d7902f")
    public static final String STEREOTYPE_NAME = "SharedDataComResource_AssociationEnd";

    @objid ("ed8ae005-932f-4abd-b762-9262254dcde3")
    public static final String SHAREDDATACOMRESOURCE_ASSOCIATIONEND_READSERVICES_TAGTYPE = "SharedDataComResource_AssociationEnd_readServices";

    @objid ("0b7587fc-d22d-40f3-b057-ab76e4b1dd94")
    public static final String SHAREDDATACOMRESOURCE_ASSOCIATIONEND_WRITESERVICES_TAGTYPE = "SharedDataComResource_AssociationEnd_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SharedDataComResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("799d1e7e-5a56-457f-9611-1fc4fc0d1bd6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SharedDataComResource_AssociationEnd >> then instantiate a {@link SharedDataComResourceAssociationEnd} proxy.
     * 
     * @return a {@link SharedDataComResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("59c61256-4b8b-4617-9229-7c7b025105dc")
    public static SharedDataComResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceAssociationEnd.STEREOTYPE_NAME);
        return SharedDataComResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SharedDataComResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SharedDataComResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("60935a7f-c4d2-41d2-974f-782e10453e4e")
    public static SharedDataComResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SharedDataComResourceAssociationEnd.canInstantiate(obj) ? new SharedDataComResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SharedDataComResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SharedDataComResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9ce3d533-e841-4326-ad02-8da6c17f30b8")
    public static SharedDataComResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SharedDataComResourceAssociationEnd.canInstantiate(obj))
        	return new SharedDataComResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("14314c5d-3346-45cf-9ed9-a08183af57e9")
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
        SharedDataComResourceAssociationEnd other = (SharedDataComResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("3ff3b737-32b8-400c-890e-699923e1e956")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_AssociationEnd_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("23103b88-a9e1-4297-94e9-56d3ae385f1f")
    public List<String> getSharedDataComResource_AssociationEnd_readServices() {
        return this.elt.getTagValues(SharedDataComResourceAssociationEnd.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_AssociationEnd_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3ee6c408-0811-41ba-91c3-ea14acb58bd3")
    public List<String> getSharedDataComResource_AssociationEnd_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceAssociationEnd.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT);
    }

    @objid ("6ac61cad-80ec-4a27-bb82-85904edffede")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_AssociationEnd_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fae8b3d0-4e37-4359-96a8-c539608c5b43")
    public void setSharedDataComResource_AssociationEnd_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceAssociationEnd.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_AssociationEnd_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6111d03c-99c1-4816-9dbe-3d67b6ea9aac")
    public void setSharedDataComResource_AssociationEnd_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceAssociationEnd.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("06c08e48-f6f7-4311-98d6-ddbdb422a860")
    protected SharedDataComResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("0e725a18-75e2-4ec3-826c-de35445a90ee")
    public static final class MdaTypes {
        @objid ("41f7517a-e3b4-4d0a-90ba-6670afe0a5a4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("89557114-cd40-46a0-8ef6-d00b5f5e92c6")
        public static TagType SHAREDDATACOMRESOURCE_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT;

        @objid ("efa46817-77af-4ce9-be1c-c9e21ae3abff")
        public static TagType SHAREDDATACOMRESOURCE_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT;

        @objid ("fc7647fd-8b1c-45d4-b3ea-708874cdeb6c")
        private static Stereotype MDAASSOCDEP;

        @objid ("7d8c9c0b-84dc-479c-a635-1bcbdfb130a2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ec3d3178-537b-4fa3-bd26-779d173f1788")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "02218156-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0221815d-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02218164-0ccf-11df-8525-001302895b2b");
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
