/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_devices_DeviceBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("83f4a7fd-3cb2-43f7-89cb-72cf3937af81")
public class ProfileAssociationDevicesDeviceBroker {
    @objid ("81f54d8b-a799-4c81-b8e7-cfa4356836c7")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_devices_DeviceBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("68a146bf-e244-4296-aec4-97426e28c027")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDevicesDeviceBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_devices_DeviceBroker >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fa2a6f61-1de6-426a-a9bf-2a241aeecb17")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDevicesDeviceBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_devices_DeviceBroker >> then instantiate a {@link ProfileAssociationDevicesDeviceBroker} proxy.
     * 
     * @return a {@link ProfileAssociationDevicesDeviceBroker} proxy on the created {@link Dependency}.
     */
    @objid ("8ffa9d05-20b6-475b-b028-27c017084651")
    public static ProfileAssociationDevicesDeviceBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDevicesDeviceBroker.STEREOTYPE_NAME);
        return ProfileAssociationDevicesDeviceBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDevicesDeviceBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_devices_DeviceBroker >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDevicesDeviceBroker} proxy or <i>null</i>.
     */
    @objid ("feace575-0e89-475e-b03e-2ca527beb98f")
    public static ProfileAssociationDevicesDeviceBroker instantiate(final Dependency obj) {
        return ProfileAssociationDevicesDeviceBroker.canInstantiate(obj) ? new ProfileAssociationDevicesDeviceBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDevicesDeviceBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_devices_DeviceBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationDevicesDeviceBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("db7cec1c-4e6d-41a5-bb87-61b2f3bb4555")
    public static ProfileAssociationDevicesDeviceBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDevicesDeviceBroker.canInstantiate(obj))
        	return new ProfileAssociationDevicesDeviceBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDevicesDeviceBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f8829cb9-59de-4472-b169-f7a3bcf2cf6e")
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
        ProfileAssociationDevicesDeviceBroker other = (ProfileAssociationDevicesDeviceBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("6a87341a-5b79-4d00-b310-d14bb30cb4a5")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("d8ad0e10-43a3-4acd-9d7a-18fde7ac0e95")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("77228ac3-17c9-4735-a257-875ebbb5aa65")
    protected ProfileAssociationDevicesDeviceBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("aed1136d-637c-472d-bf2a-29891356990e")
    public static final class MdaTypes {
        @objid ("a79fd4d7-05d1-4579-aebf-6842c08849d9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("048fe046-d702-430a-a070-509694596350")
        private static Stereotype MDAASSOCDEP;

        @objid ("289f88ab-b2eb-4e33-961f-f5e3bced5701")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("de9ccfc2-559e-455c-a94f-ddca724f8cb8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "49298d65-9759-11e0-94fb-0027103f347c");
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
