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
 * Proxy class to handle a {@link AssociationEnd} with << StorageResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a14bd25b-fd2c-4408-b8e9-b221f123ca77")
public class StorageResourceAssociationEnd extends ResourceAssociationEnd {
    @objid ("6318577c-bebd-4a80-b572-2596dd872d78")
    public static final String STEREOTYPE_NAME = "StorageResource_AssociationEnd";

    @objid ("05a29394-ba2b-43bc-b0e3-e79c6d51745d")
    public static final String STORAGERESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE = "StorageResource_AssociationEnd_elementSize";

    /**
     * Tells whether a {@link StorageResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << StorageResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b51d438d-928e-484e-a89a-a43224da9dd1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << StorageResource_AssociationEnd >> then instantiate a {@link StorageResourceAssociationEnd} proxy.
     * 
     * @return a {@link StorageResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("6e1b65eb-4391-4c4c-88d6-c5a2135b5c7f")
    public static StorageResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceAssociationEnd.STEREOTYPE_NAME);
        return StorageResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link StorageResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << StorageResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link StorageResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("18427262-7280-4834-9319-d5519a1d5c92")
    public static StorageResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return StorageResourceAssociationEnd.canInstantiate(obj) ? new StorageResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StorageResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << StorageResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link StorageResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("37ba19fc-2776-44e0-92c5-60fb39cea0de")
    public static StorageResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (StorageResourceAssociationEnd.canInstantiate(obj))
        	return new StorageResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("StorageResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("349c5007-2494-4837-bbeb-5d52357efb82")
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
        StorageResourceAssociationEnd other = (StorageResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("a45faec6-a2c0-45a3-8faf-f2badf382af0")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'StorageResource_AssociationEnd_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("28651f8c-525d-4ec8-a6ad-597c0686c08e")
    public String getStorageResource_AssociationEnd_elementSize() {
        return this.elt.getTagValue(StorageResourceAssociationEnd.MdaTypes.STORAGERESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT);
    }

    @objid ("7384081a-ba4c-47f7-8c33-fce66c28c6e1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'StorageResource_AssociationEnd_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e47d76a8-2995-409f-b625-b645db143624")
    public void setStorageResource_AssociationEnd_elementSize(final String value) {
        this.elt.putTagValue(StorageResourceAssociationEnd.MdaTypes.STORAGERESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    @objid ("988930e4-e3cc-4951-858f-38e4eaeb5f83")
    protected StorageResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("2b02b047-cb98-4b99-9c8f-07a7f40b6a34")
    public static final class MdaTypes {
        @objid ("dbe93e54-12f8-4a16-9036-11e389a62a98")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c64aa215-60b7-4272-a3e1-bc90c162e38a")
        public static TagType STORAGERESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("49c4209f-81b9-4ce4-80e7-df50839892c1")
        private static Stereotype MDAASSOCDEP;

        @objid ("fbb3925b-d064-457d-8a3c-39650d798c6b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4521ca47-3d25-4483-9d72-bf22fd481abb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa2938f-0cce-11df-8525-001302895b2b");
            STORAGERESOURCE_ASSOCIATIONEND_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa4f5d0-0cce-11df-8525-001302895b2b");
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
