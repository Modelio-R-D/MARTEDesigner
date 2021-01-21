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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_memoryBlockAddressElements_MemoryBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("93959c69-13b1-46af-89c5-b988b64f9e08")
public class ProfileAssociationMemoryBlockAddressElementsMemoryBroker {
    @objid ("56d387a7-c4dd-454f-a588-6941b2337988")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_memoryBlockAddressElements_MemoryBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("2d371e0d-4351-4ed1-8079-ea6f0d9a5cd2")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMemoryBlockAddressElementsMemoryBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_memoryBlockAddressElements_MemoryBroker >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("002c4163-6208-41ae-b0f8-3f45835c6753")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemoryBlockAddressElementsMemoryBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_memoryBlockAddressElements_MemoryBroker >> then instantiate a {@link ProfileAssociationMemoryBlockAddressElementsMemoryBroker} proxy.
     * 
     * @return a {@link ProfileAssociationMemoryBlockAddressElementsMemoryBroker} proxy on the created {@link Dependency}.
     */
    @objid ("42d34437-26f5-4feb-aeec-bc07fb11fc6c")
    public static ProfileAssociationMemoryBlockAddressElementsMemoryBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemoryBlockAddressElementsMemoryBroker.STEREOTYPE_NAME);
        return ProfileAssociationMemoryBlockAddressElementsMemoryBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMemoryBlockAddressElementsMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_memoryBlockAddressElements_MemoryBroker >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMemoryBlockAddressElementsMemoryBroker} proxy or <i>null</i>.
     */
    @objid ("8dc833a4-9a19-4217-ac01-dd204a00fd46")
    public static ProfileAssociationMemoryBlockAddressElementsMemoryBroker instantiate(final Dependency obj) {
        return ProfileAssociationMemoryBlockAddressElementsMemoryBroker.canInstantiate(obj) ? new ProfileAssociationMemoryBlockAddressElementsMemoryBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMemoryBlockAddressElementsMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_memoryBlockAddressElements_MemoryBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMemoryBlockAddressElementsMemoryBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bc23accb-9a62-415e-b83a-40e8f904c8ca")
    public static ProfileAssociationMemoryBlockAddressElementsMemoryBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMemoryBlockAddressElementsMemoryBroker.canInstantiate(obj))
        	return new ProfileAssociationMemoryBlockAddressElementsMemoryBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMemoryBlockAddressElementsMemoryBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("24fec0aa-9b3e-4e7d-90e1-a92945416f58")
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
        ProfileAssociationMemoryBlockAddressElementsMemoryBroker other = (ProfileAssociationMemoryBlockAddressElementsMemoryBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("cc91fc3f-b870-4822-be1b-677769fb5d91")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("32f74c2d-432d-4edb-9406-9bbd1cbb9d81")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cc741791-ca74-48c2-9ba7-eac6271d9004")
    protected ProfileAssociationMemoryBlockAddressElementsMemoryBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("c5cdf0c5-36dd-4573-a338-2ebe5a14b20b")
    public static final class MdaTypes {
        @objid ("06cf4fd3-2899-45dc-969c-c0a924386ab4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("56024e3b-29df-4f37-9638-2f51e8b8c112")
        private static Stereotype MDAASSOCDEP;

        @objid ("51bae16f-5450-4caf-bdb8-b00b6026de4f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5edb196e-7eb6-41d3-b36e-dbcee40267d5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "bb32affa-9759-11e0-94fb-0027103f347c");
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
