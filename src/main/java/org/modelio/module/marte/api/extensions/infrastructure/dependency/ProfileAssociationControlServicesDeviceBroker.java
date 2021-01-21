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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_controlServices_DeviceBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("be6c5305-3d59-46e5-8d53-c7af2421995b")
public class ProfileAssociationControlServicesDeviceBroker {
    @objid ("c2eb8d01-0778-4aea-ba28-422017aebafc")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_controlServices_DeviceBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("919da3ba-3e54-4b54-88c5-9c0912635974")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationControlServicesDeviceBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_controlServices_DeviceBroker >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("64ab26d1-8010-46a7-8cac-6a70c2bea729")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationControlServicesDeviceBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_controlServices_DeviceBroker >> then instantiate a {@link ProfileAssociationControlServicesDeviceBroker} proxy.
     * 
     * @return a {@link ProfileAssociationControlServicesDeviceBroker} proxy on the created {@link Dependency}.
     */
    @objid ("0bbb2184-7922-4f0c-8880-358c8c6e65af")
    public static ProfileAssociationControlServicesDeviceBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationControlServicesDeviceBroker.STEREOTYPE_NAME);
        return ProfileAssociationControlServicesDeviceBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationControlServicesDeviceBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_controlServices_DeviceBroker >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationControlServicesDeviceBroker} proxy or <i>null</i>.
     */
    @objid ("95857e3b-db2e-4411-bc80-8bacefd405ae")
    public static ProfileAssociationControlServicesDeviceBroker instantiate(final Dependency obj) {
        return ProfileAssociationControlServicesDeviceBroker.canInstantiate(obj) ? new ProfileAssociationControlServicesDeviceBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationControlServicesDeviceBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_controlServices_DeviceBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationControlServicesDeviceBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ec81c418-292e-44ac-84ea-d2e955016ce7")
    public static ProfileAssociationControlServicesDeviceBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationControlServicesDeviceBroker.canInstantiate(obj))
        	return new ProfileAssociationControlServicesDeviceBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationControlServicesDeviceBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d8356f8b-2eb2-4b4d-9a3f-19f74b84d35c")
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
        ProfileAssociationControlServicesDeviceBroker other = (ProfileAssociationControlServicesDeviceBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("41f10eb6-ea1b-41ec-9db5-19bb82464698")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("cfb7ce6a-dbf6-4a54-a7cb-37fe86fa4f4f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1b0981b2-20b4-4c3b-b56e-fe3a30799afd")
    protected ProfileAssociationControlServicesDeviceBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("62dc56b7-ffd8-47c4-8bc8-7b4860cfa330")
    public static final class MdaTypes {
        @objid ("a764fb50-6b28-4d1e-93b9-ccf86b03997d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0e37ae5b-bafc-4ced-8eae-43e5cc3c909b")
        private static Stereotype MDAASSOCDEP;

        @objid ("04649d28-4721-4d85-8684-ca346b7d8af7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c704d097-d035-4a4c-afc1-fd7e7ff94b92")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "65e83a92-9759-11e0-94fb-0027103f347c");
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
