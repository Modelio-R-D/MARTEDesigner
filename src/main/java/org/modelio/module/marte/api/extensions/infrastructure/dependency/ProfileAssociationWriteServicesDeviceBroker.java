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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_writeServices_DeviceBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8e57c45b-421e-444c-8476-49f9ddad5c51")
public class ProfileAssociationWriteServicesDeviceBroker {
    @objid ("6cbf0d1a-ebfa-4fb1-93c7-0aeee39ca78f")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_writeServices_DeviceBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("578b9bd4-2000-48a6-8fa4-78cc4ba1204f")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationWriteServicesDeviceBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_writeServices_DeviceBroker >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fd013997-6350-405b-a4c5-46158750b7ff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationWriteServicesDeviceBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_writeServices_DeviceBroker >> then instantiate a {@link ProfileAssociationWriteServicesDeviceBroker} proxy.
     * 
     * @return a {@link ProfileAssociationWriteServicesDeviceBroker} proxy on the created {@link Dependency}.
     */
    @objid ("7095ce79-5964-453d-9a58-093ce5a19a7e")
    public static ProfileAssociationWriteServicesDeviceBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationWriteServicesDeviceBroker.STEREOTYPE_NAME);
        return ProfileAssociationWriteServicesDeviceBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationWriteServicesDeviceBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_writeServices_DeviceBroker >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationWriteServicesDeviceBroker} proxy or <i>null</i>.
     */
    @objid ("a14b05fd-aec8-4fd5-8c55-120782db079e")
    public static ProfileAssociationWriteServicesDeviceBroker instantiate(final Dependency obj) {
        return ProfileAssociationWriteServicesDeviceBroker.canInstantiate(obj) ? new ProfileAssociationWriteServicesDeviceBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationWriteServicesDeviceBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_writeServices_DeviceBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationWriteServicesDeviceBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("de18d743-32fd-464e-81ea-7b92d516592f")
    public static ProfileAssociationWriteServicesDeviceBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationWriteServicesDeviceBroker.canInstantiate(obj))
        	return new ProfileAssociationWriteServicesDeviceBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationWriteServicesDeviceBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("75339c30-3093-478f-8ce5-9d42d9f2d8a6")
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
        ProfileAssociationWriteServicesDeviceBroker other = (ProfileAssociationWriteServicesDeviceBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("2954f4f0-6b99-4e4a-86ef-72ca9ffbf198")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b6d4c3eb-74eb-4924-a471-3ade68f0db1b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("dba875eb-2457-4c87-bb2c-cc6e46d897e8")
    protected ProfileAssociationWriteServicesDeviceBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("36d25439-5fce-4388-96a2-087d02a2bdc5")
    public static final class MdaTypes {
        @objid ("e48f4f4a-f650-414a-ac88-16d00b571d67")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("71eecfed-8856-4b07-8a5a-0e97d0ef7587")
        private static Stereotype MDAASSOCDEP;

        @objid ("b751a0c5-f94d-4e52-be15-fe48d5bb8af1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cf0c8bb3-9185-4fe9-b68f-f455d647c0ee")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "843ea92f-9759-11e0-94fb-0027103f347c");
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
