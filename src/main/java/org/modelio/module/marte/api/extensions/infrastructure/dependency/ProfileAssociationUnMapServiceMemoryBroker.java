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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_unMapService_MemoryBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("03c35b77-fe7d-4a50-a596-c42f17a37766")
public class ProfileAssociationUnMapServiceMemoryBroker {
    @objid ("03589fd4-5abb-4acb-ba07-72fe69e1c49a")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_unMapService_MemoryBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("e101e134-42af-4276-9ac2-40c45281de2a")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationUnMapServiceMemoryBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_unMapService_MemoryBroker >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d1369d09-1d14-464c-b8f1-8f7998de64ce")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUnMapServiceMemoryBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_unMapService_MemoryBroker >> then instantiate a {@link ProfileAssociationUnMapServiceMemoryBroker} proxy.
     * 
     * @return a {@link ProfileAssociationUnMapServiceMemoryBroker} proxy on the created {@link Dependency}.
     */
    @objid ("85393cc3-c45f-4e1f-921a-261930b15bbe")
    public static ProfileAssociationUnMapServiceMemoryBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationUnMapServiceMemoryBroker.STEREOTYPE_NAME);
        return ProfileAssociationUnMapServiceMemoryBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationUnMapServiceMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_unMapService_MemoryBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationUnMapServiceMemoryBroker} proxy or <i>null</i>.
     */
    @objid ("2a349c7a-d807-4a6a-b044-851998baf81d")
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
    @objid ("b79c52ad-55f2-4f3b-bbf3-002f5ee57a24")
    public static ProfileAssociationUnMapServiceMemoryBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationUnMapServiceMemoryBroker.canInstantiate(obj))
        	return new ProfileAssociationUnMapServiceMemoryBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationUnMapServiceMemoryBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c595580b-47e0-4336-9b20-98805f8d764a")
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
    @objid ("e8f47a60-8fbf-4fba-a0a1-b8a518fcd8ec")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("c5936159-369b-4251-b4be-2a1bb03a2c6e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a076e8ea-51f1-4941-8bb7-5463f5a57566")
    protected ProfileAssociationUnMapServiceMemoryBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("5542dd02-4d56-4563-b4a4-9c2cc3215079")
    public static final class MdaTypes {
        @objid ("214b5f52-fe5f-4c83-8267-6eefbc8c0d5e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8c5775bb-46f2-4da4-8933-fea4f51ac940")
        private static Stereotype MDAASSOCDEP;

        @objid ("48bc65a2-df1e-4748-a977-df447203ea1b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f2db3e86-47ae-474d-b2b3-a557e7a61123")
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
