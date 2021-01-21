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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_arbiters_HwMedia_HwArbiter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f44daa73-677a-4f59-9bb8-4ed5967039aa")
public class ProfileAssociationArbitersHwMediaHwArbiter {
    @objid ("ddd8385a-822f-43da-b704-4994ad9b48a7")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_arbiters_HwMedia_HwArbiter";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("05a39f6c-eae7-4f86-aaee-d6d8c7942551")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationArbitersHwMediaHwArbiter proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_arbiters_HwMedia_HwArbiter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4ffa0db1-20e2-4b4f-8359-7282d1cf87c7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationArbitersHwMediaHwArbiter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_arbiters_HwMedia_HwArbiter >> then instantiate a {@link ProfileAssociationArbitersHwMediaHwArbiter} proxy.
     * 
     * @return a {@link ProfileAssociationArbitersHwMediaHwArbiter} proxy on the created {@link Dependency}.
     */
    @objid ("19471190-6176-49c6-8327-266b8f79c132")
    public static ProfileAssociationArbitersHwMediaHwArbiter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationArbitersHwMediaHwArbiter.STEREOTYPE_NAME);
        return ProfileAssociationArbitersHwMediaHwArbiter.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationArbitersHwMediaHwArbiter} proxy from a {@link Dependency} stereotyped << ProfileAssociation_arbiters_HwMedia_HwArbiter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationArbitersHwMediaHwArbiter} proxy or <i>null</i>.
     */
    @objid ("fa2c7cf2-83d9-4aeb-9038-8e804742f651")
    public static ProfileAssociationArbitersHwMediaHwArbiter instantiate(final Dependency obj) {
        return ProfileAssociationArbitersHwMediaHwArbiter.canInstantiate(obj) ? new ProfileAssociationArbitersHwMediaHwArbiter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationArbitersHwMediaHwArbiter} proxy from a {@link Dependency} stereotyped << ProfileAssociation_arbiters_HwMedia_HwArbiter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationArbitersHwMediaHwArbiter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("682ccc28-3804-4eca-812c-b660a9f25e58")
    public static ProfileAssociationArbitersHwMediaHwArbiter safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationArbitersHwMediaHwArbiter.canInstantiate(obj))
        	return new ProfileAssociationArbitersHwMediaHwArbiter(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationArbitersHwMediaHwArbiter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("48b531c8-a13e-4f48-84f9-508566c676f9")
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
        ProfileAssociationArbitersHwMediaHwArbiter other = (ProfileAssociationArbitersHwMediaHwArbiter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("283df670-db49-4d35-9931-2358314f5bae")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a4ad98b1-7562-40a2-8585-28a07d8bc83f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("29e701b2-e7de-4100-9dad-7cd448b40d2b")
    protected ProfileAssociationArbitersHwMediaHwArbiter(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("c75f161a-4a9c-49d3-a08f-b8c215351900")
    public static final class MdaTypes {
        @objid ("8fb186d2-5940-4a01-8dd1-919345cf9468")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2037d020-f0e7-40aa-87b6-dab000ab91af")
        private static Stereotype MDAASSOCDEP;

        @objid ("df8c569d-7414-43b5-ac7e-9491b831a5df")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("58fbfc2c-e3e0-4fd4-b21c-8b4e7dccb9b4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dc1f5c62-936a-11e0-b960-0027103f347c");
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
