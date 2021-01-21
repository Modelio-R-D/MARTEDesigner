/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.association.HwResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwCommunicationResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("700936e0-be73-489a-a3e1-3562f8e81911")
public class HwCommunicationResourceAssociation extends HwResourceAssociation {
    @objid ("58b313d1-e401-4115-820a-27648e885689")
    public static final String STEREOTYPE_NAME = "HwCommunicationResource_Association";

    /**
     * Tells whether a {@link HwCommunicationResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwCommunicationResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7bb761a1-d60b-4bd9-ac47-0587ac241c7b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwCommunicationResource_Association >> then instantiate a {@link HwCommunicationResourceAssociation} proxy.
     * 
     * @return a {@link HwCommunicationResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("6b1fadee-4a90-468b-8990-86aa53035767")
    public static HwCommunicationResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceAssociation.STEREOTYPE_NAME);
        return HwCommunicationResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceAssociation} proxy from a {@link Association} stereotyped << HwCommunicationResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwCommunicationResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("01046a6d-4243-441f-8853-b478d480926c")
    public static HwCommunicationResourceAssociation instantiate(final Association obj) {
        return HwCommunicationResourceAssociation.canInstantiate(obj) ? new HwCommunicationResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceAssociation} proxy from a {@link Association} stereotyped << HwCommunicationResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwCommunicationResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a36e5932-1bd9-47fe-860d-3acd26ac01bf")
    public static HwCommunicationResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwCommunicationResourceAssociation.canInstantiate(obj))
        	return new HwCommunicationResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("HwCommunicationResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c1ae7432-9ac2-4558-a71a-aa686d25f8e4")
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
        HwCommunicationResourceAssociation other = (HwCommunicationResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("81cd9127-6622-48d9-9cd7-76d8dfefd3f2")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("49747ad2-0410-4971-ba49-bda0f2eba341")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1dc37b56-cd0d-4d2c-a7fb-bddbc716c7c8")
    protected HwCommunicationResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("f75178f6-5e48-403e-a976-3cf127105adf")
    public static final class MdaTypes {
        @objid ("406048e4-7437-465f-a9b0-3aa5bbc92fd5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1fd78ba2-9b19-4285-8824-7f67772ce4fb")
        private static Stereotype MDAASSOCDEP;

        @objid ("d8613986-26c2-4785-819e-79423494527d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("87aa3994-26f0-433b-aa05-f7e45cafd039")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1856c4ad-10ad-11df-81d9-0014222a9f79");
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
