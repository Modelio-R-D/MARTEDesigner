/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_blocksComputing_HwPLD_HwComputingResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e4ff7875-909f-4388-97b0-c19886dc6256")
public class ProfileAssociationBlocksComputingHwPLDHwComputingResource {
    @objid ("5a43e5a7-7822-4912-8f93-43252a044ea4")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_blocksComputing_HwPLD_HwComputingResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("9355c296-51f9-46c7-9219-57453c6557b0")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_blocksComputing_HwPLD_HwComputingResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ec511675-a836-41a5-8b0e-50471da88362")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBlocksComputingHwPLDHwComputingResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_blocksComputing_HwPLD_HwComputingResource >> then instantiate a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource} proxy.
     * 
     * @return a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource} proxy on the created {@link Dependency}.
     */
    @objid ("4810e914-ca08-4f2f-8d8b-672c2a5b0c6d")
    public static ProfileAssociationBlocksComputingHwPLDHwComputingResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBlocksComputingHwPLDHwComputingResource.STEREOTYPE_NAME);
        return ProfileAssociationBlocksComputingHwPLDHwComputingResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_blocksComputing_HwPLD_HwComputingResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource} proxy or <i>null</i>.
     */
    @objid ("7efc5198-6b9a-4748-8d52-5d00fd1ce7c3")
    public static ProfileAssociationBlocksComputingHwPLDHwComputingResource instantiate(final Dependency obj) {
        return ProfileAssociationBlocksComputingHwPLDHwComputingResource.canInstantiate(obj) ? new ProfileAssociationBlocksComputingHwPLDHwComputingResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_blocksComputing_HwPLD_HwComputingResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("95fd066f-ac7b-4dc0-9b61-9ca13ff06f04")
    public static ProfileAssociationBlocksComputingHwPLDHwComputingResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationBlocksComputingHwPLDHwComputingResource.canInstantiate(obj))
        	return new ProfileAssociationBlocksComputingHwPLDHwComputingResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationBlocksComputingHwPLDHwComputingResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7e5519fc-ddb4-4770-9558-0b312c17ec14")
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
        ProfileAssociationBlocksComputingHwPLDHwComputingResource other = (ProfileAssociationBlocksComputingHwPLDHwComputingResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("205ee4e9-280c-4511-902a-9a3ea46fb119")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("12b57186-e346-472e-bcfb-301d91737a59")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b5f9f202-9509-4bd5-bfe2-f924ff221c81")
    protected ProfileAssociationBlocksComputingHwPLDHwComputingResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d64f2f81-43df-4c2d-b6e0-0a25cda54a8d")
    public static final class MdaTypes {
        @objid ("f52b7633-78c7-4546-a905-45d6c18f5ac0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("57c6cb08-3509-4867-a2f5-38d4effc33ec")
        private static Stereotype MDAASSOCDEP;

        @objid ("3b5545bb-12b7-410a-abb3-92051c4ad408")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1b31f164-cae0-4e6e-ae14-7fcfb6936932")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "10437743-937d-11e0-b960-0027103f347c");
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
