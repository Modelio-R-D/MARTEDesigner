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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_readServices_DeviceBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("97ab99e7-4cde-4fd9-8d25-c2c253247353")
public class ProfileAssociationReadServicesDeviceBroker {
    @objid ("c0e84533-385c-4433-9de2-cbd7040e1499")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_readServices_DeviceBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("8b992376-bef9-4d68-9f8d-01b63e46ba9e")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationReadServicesDeviceBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_readServices_DeviceBroker >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9d4d482d-8002-4ce0-8e7a-0f79432f972f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationReadServicesDeviceBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_readServices_DeviceBroker >> then instantiate a {@link ProfileAssociationReadServicesDeviceBroker} proxy.
     * 
     * @return a {@link ProfileAssociationReadServicesDeviceBroker} proxy on the created {@link Dependency}.
     */
    @objid ("4c95383e-4bf2-431b-88a0-4982af6ca72c")
    public static ProfileAssociationReadServicesDeviceBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationReadServicesDeviceBroker.STEREOTYPE_NAME);
        return ProfileAssociationReadServicesDeviceBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationReadServicesDeviceBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_readServices_DeviceBroker >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationReadServicesDeviceBroker} proxy or <i>null</i>.
     */
    @objid ("ba697d40-2bd9-4730-b74b-276a98540911")
    public static ProfileAssociationReadServicesDeviceBroker instantiate(final Dependency obj) {
        return ProfileAssociationReadServicesDeviceBroker.canInstantiate(obj) ? new ProfileAssociationReadServicesDeviceBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationReadServicesDeviceBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_readServices_DeviceBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationReadServicesDeviceBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cd3568f9-2d36-4aea-8df1-e16b9d2396e5")
    public static ProfileAssociationReadServicesDeviceBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationReadServicesDeviceBroker.canInstantiate(obj))
        	return new ProfileAssociationReadServicesDeviceBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationReadServicesDeviceBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3114a267-2ec8-4ed6-b6c1-a479a2dd6428")
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
        ProfileAssociationReadServicesDeviceBroker other = (ProfileAssociationReadServicesDeviceBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("8e6ed066-b5d2-4fd6-bf19-ec9b6e85fce9")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("bd997d16-6cab-4795-b991-aa6c25ec42d0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e674e857-6ec3-494e-b270-059cc42389fd")
    protected ProfileAssociationReadServicesDeviceBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("a477daa7-e593-41e9-b57a-6243591acfae")
    public static final class MdaTypes {
        @objid ("6b238455-24f9-4157-b788-62ae077b1eb2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("be574b7b-b7aa-4c68-b906-b074bc99f74a")
        private static Stereotype MDAASSOCDEP;

        @objid ("fd767822-ff66-4f1b-8f17-f69e64e131b3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("be5a69df-648f-40bd-98ff-2b41ca7a932e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "79daa2a8-9759-11e0-94fb-0027103f347c");
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
