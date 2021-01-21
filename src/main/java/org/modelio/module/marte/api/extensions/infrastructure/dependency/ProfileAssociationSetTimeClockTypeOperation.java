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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_setTime_ClockType_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0b4be14e-ca98-468b-9f05-bbab1010ae94")
public class ProfileAssociationSetTimeClockTypeOperation {
    @objid ("77d6c399-7480-4689-a4cc-e72888475979")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_setTime_ClockType_Operation";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("6003208c-9945-4281-ae4a-8ddf1ca7e402")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationSetTimeClockTypeOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_setTime_ClockType_Operation >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4b8b557c-4417-42db-a831-c0177f61772a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSetTimeClockTypeOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_setTime_ClockType_Operation >> then instantiate a {@link ProfileAssociationSetTimeClockTypeOperation} proxy.
     * 
     * @return a {@link ProfileAssociationSetTimeClockTypeOperation} proxy on the created {@link Dependency}.
     */
    @objid ("34c41700-68d0-4ae6-8cee-5d9f201e6ec2")
    public static ProfileAssociationSetTimeClockTypeOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSetTimeClockTypeOperation.STEREOTYPE_NAME);
        return ProfileAssociationSetTimeClockTypeOperation.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSetTimeClockTypeOperation} proxy from a {@link Dependency} stereotyped << ProfileAssociation_setTime_ClockType_Operation >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationSetTimeClockTypeOperation} proxy or <i>null</i>.
     */
    @objid ("c51ca24b-ee10-4cb9-a6ac-f0d4a2ad9ff4")
    public static ProfileAssociationSetTimeClockTypeOperation instantiate(final Dependency obj) {
        return ProfileAssociationSetTimeClockTypeOperation.canInstantiate(obj) ? new ProfileAssociationSetTimeClockTypeOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSetTimeClockTypeOperation} proxy from a {@link Dependency} stereotyped << ProfileAssociation_setTime_ClockType_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationSetTimeClockTypeOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a3b7f238-e486-48e4-9e26-457d4598417d")
    public static ProfileAssociationSetTimeClockTypeOperation safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationSetTimeClockTypeOperation.canInstantiate(obj))
        	return new ProfileAssociationSetTimeClockTypeOperation(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationSetTimeClockTypeOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("725797f9-bc94-421b-a7a2-c266797067c7")
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
        ProfileAssociationSetTimeClockTypeOperation other = (ProfileAssociationSetTimeClockTypeOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("0ec31900-5f55-4490-b894-3b28a54c6907")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("27c9a119-2c9d-491d-a65f-3ad3765c42a9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("09851696-f2d6-407f-b3b6-d210d6182838")
    protected ProfileAssociationSetTimeClockTypeOperation(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("0a9e6bd0-a608-4801-9999-069ae6a236fd")
    public static final class MdaTypes {
        @objid ("5f5ab220-1031-4786-9130-91e6331769b9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c55c292b-a961-4a57-877f-3a26ea2f0b9d")
        private static Stereotype MDAASSOCDEP;

        @objid ("c8485235-32de-4761-ac7f-ac8c12f34c3a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0dd46bb2-1d3e-471b-b402-03d662c87d06")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dfec158d-82bb-11df-b65a-0014222a9f79");
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
