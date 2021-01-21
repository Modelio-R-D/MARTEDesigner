/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.TimerResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SwTimerResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("106c7f4d-6b94-46e7-931f-7f65f7b53016")
public class SwTimerResourceAssociation extends TimerResourceAssociation {
    @objid ("013fa45f-2310-420b-a684-0b3e018a4b82")
    public static final String STEREOTYPE_NAME = "SwTimerResource_Association";

    /**
     * Tells whether a {@link SwTimerResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwTimerResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("238c0023-9fa7-4637-b442-dbde84c40a52")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwTimerResource_Association >> then instantiate a {@link SwTimerResourceAssociation} proxy.
     * 
     * @return a {@link SwTimerResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("902e4919-f3fe-4c2c-af4b-654269bc8d23")
    public static SwTimerResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceAssociation.STEREOTYPE_NAME);
        return SwTimerResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceAssociation} proxy from a {@link Association} stereotyped << SwTimerResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwTimerResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("2b7cb115-f557-4c90-8fde-a7d7bc5616ce")
    public static SwTimerResourceAssociation instantiate(final Association obj) {
        return SwTimerResourceAssociation.canInstantiate(obj) ? new SwTimerResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceAssociation} proxy from a {@link Association} stereotyped << SwTimerResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SwTimerResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8139d656-4d2b-441b-9f90-97b03a505737")
    public static SwTimerResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwTimerResourceAssociation.canInstantiate(obj))
        	return new SwTimerResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwTimerResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5ca1d78f-c851-4802-80f7-9aba7aa3a0d2")
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
        SwTimerResourceAssociation other = (SwTimerResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("1b96f459-c691-4ec2-8ad7-68822f750789")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("789d86af-8c8e-48b7-8fbb-69e8ce66b491")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("70a151ec-d27a-4381-aa45-8f272573f01e")
    protected SwTimerResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("31a4a7ee-e47c-4139-a0a9-c7d06bdce03c")
    public static final class MdaTypes {
        @objid ("078d0452-e70a-4096-a491-e5fa3f15a386")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d8ec94e3-cac3-4ec6-baaa-b262aba8c073")
        private static Stereotype MDAASSOCDEP;

        @objid ("a56e0172-3135-444f-b33f-739934699c64")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a778ffbf-fd91-4f0c-b2c5-29d5a6ad4520")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aca41632-10cf-11df-81d9-0014222a9f79");
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
