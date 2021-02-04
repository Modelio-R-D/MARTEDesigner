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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_openServices_DeviceBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("47536897-b4a0-4619-97f3-5e1a3a039898")
public class ProfileAssociationOpenServicesDeviceBroker {
    @objid ("031a8c25-e229-448e-aa78-444944d1abfa")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_openServices_DeviceBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("d5c66857-be5e-4a61-a202-3021b2876814")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOpenServicesDeviceBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_openServices_DeviceBroker >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("78c64266-1bb0-4069-88ce-9b78a9b4238b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOpenServicesDeviceBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_openServices_DeviceBroker >> then instantiate a {@link ProfileAssociationOpenServicesDeviceBroker} proxy.
     * 
     * @return a {@link ProfileAssociationOpenServicesDeviceBroker} proxy on the created {@link Dependency}.
     */
    @objid ("602c12a7-9186-4c1e-910a-99055f0ce58f")
    public static ProfileAssociationOpenServicesDeviceBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOpenServicesDeviceBroker.STEREOTYPE_NAME);
        return ProfileAssociationOpenServicesDeviceBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOpenServicesDeviceBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_openServices_DeviceBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOpenServicesDeviceBroker} proxy or <i>null</i>.
     */
    @objid ("01de77d7-58c2-49d0-ab9c-5b2707b9927d")
    public static ProfileAssociationOpenServicesDeviceBroker instantiate(final Dependency obj) {
        return ProfileAssociationOpenServicesDeviceBroker.canInstantiate(obj) ? new ProfileAssociationOpenServicesDeviceBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOpenServicesDeviceBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_openServices_DeviceBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationOpenServicesDeviceBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4e79500e-3d1d-499e-bf5f-1c550bb03881")
    public static ProfileAssociationOpenServicesDeviceBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOpenServicesDeviceBroker.canInstantiate(obj))
        	return new ProfileAssociationOpenServicesDeviceBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOpenServicesDeviceBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ecc2bba7-f6ad-48b1-90c1-084b6f3f9af9")
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
        ProfileAssociationOpenServicesDeviceBroker other = (ProfileAssociationOpenServicesDeviceBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("b7881d08-35f0-406d-984c-54cf323dca35")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("37413dee-bf69-4b98-a0a0-4a8d08f1a052")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("69730de6-4cd3-45e0-a460-cc03f2b5f289")
    protected ProfileAssociationOpenServicesDeviceBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("22341ef5-cc95-4bd9-a848-34e0a1a72887")
    public static final class MdaTypes {
        @objid ("07d6c4da-5a22-401f-84d6-132303842114")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5c1e40dc-746b-48b3-b5d7-614b057821c4")
        private static Stereotype MDAASSOCDEP;

        @objid ("725ba79a-5bb1-4ced-b615-b47ce5b4159e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("86ff29b1-6d23-4223-b709-6361d3eca2dc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6f2d5c41-9759-11e0-94fb-0027103f347c");
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
