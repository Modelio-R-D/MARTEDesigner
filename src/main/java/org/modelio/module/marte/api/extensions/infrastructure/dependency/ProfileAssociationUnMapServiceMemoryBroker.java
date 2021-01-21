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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_unMapService_MemoryBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("03c35b77-fe7d-4a50-a596-c42f17a37766")
public class ProfileAssociationUnMapServiceMemoryBroker {
    @objid ("d8616986-fed3-4689-a116-1316a0a50cd3")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_unMapService_MemoryBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("ac95b0cf-83e5-40d7-921a-cb33b1a3bd80")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationUnMapServiceMemoryBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_unMapService_MemoryBroker >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e4672fca-6def-478a-8516-faa61c769036")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUnMapServiceMemoryBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_unMapService_MemoryBroker >> then instantiate a {@link ProfileAssociationUnMapServiceMemoryBroker} proxy.
     * 
     * @return a {@link ProfileAssociationUnMapServiceMemoryBroker} proxy on the created {@link Dependency}.
     */
    @objid ("0ce08a03-4b08-480b-896a-61ffb4688fcc")
    public static ProfileAssociationUnMapServiceMemoryBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUnMapServiceMemoryBroker.STEREOTYPE_NAME);
        return ProfileAssociationUnMapServiceMemoryBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationUnMapServiceMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_unMapService_MemoryBroker >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationUnMapServiceMemoryBroker} proxy or <i>null</i>.
     */
    @objid ("7e85ad84-0e7e-43f5-81d6-3a131f46e7b9")
    public static ProfileAssociationUnMapServiceMemoryBroker instantiate(final Dependency obj) {
        return ProfileAssociationUnMapServiceMemoryBroker.canInstantiate(obj) ? new ProfileAssociationUnMapServiceMemoryBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationUnMapServiceMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_unMapService_MemoryBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationUnMapServiceMemoryBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("87f14c79-7e93-4005-b00c-58a1d85f69e9")
    public static ProfileAssociationUnMapServiceMemoryBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationUnMapServiceMemoryBroker.canInstantiate(obj))
        	return new ProfileAssociationUnMapServiceMemoryBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationUnMapServiceMemoryBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d50a7f45-f56f-498d-a7ba-578adbae4098")
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
        ProfileAssociationUnMapServiceMemoryBroker other = (ProfileAssociationUnMapServiceMemoryBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("6f8e88ae-e8b3-4c30-a2d6-baa7140d6466")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("3f038178-d4ed-4cd8-8030-1e4feebee1db")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("055a47b2-a711-4146-8040-a1a14e6ae2fe")
    protected ProfileAssociationUnMapServiceMemoryBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("5542dd02-4d56-4563-b4a4-9c2cc3215079")
    public static final class MdaTypes {
        @objid ("87dbfe5a-9552-429a-ae9b-578e00f481bd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4254ac2b-6cac-4a07-8683-2d353ea4a811")
        private static Stereotype MDAASSOCDEP;

        @objid ("5650a431-4ca7-4204-b893-e88a808e27cc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4f8a9a88-4bfa-4ec3-a817-a53927d15496")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "edc75eae-9759-11e0-94fb-0027103f347c");
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
