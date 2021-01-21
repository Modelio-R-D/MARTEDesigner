/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link ModelElement} with << GaWorkloadBehavior_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("31278931-d94b-41e5-93cf-5217da00d4df")
public class GaWorkloadBehaviorModelElement {
    @objid ("004d7402-791e-44d9-bd87-1e2dd0e29669")
    public static final String STEREOTYPE_NAME = "GaWorkloadBehavior_ModelElement";

    @objid ("19f5f8e5-91aa-42e2-bcc7-58e52dfe3fc7")
    public static final String GAWORKLOADBEHAVIOR_MODELELEMENT_BEHAVIOR_TAGTYPE = "GaWorkloadBehavior_ModelElement_behavior";

    @objid ("91aa63a4-d067-4737-b1e8-d942b5d0739f")
    public static final String GAWORKLOADBEHAVIOR_MODELELEMENT_DEMAND_TAGTYPE = "GaWorkloadBehavior_ModelElement_demand";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("45b20d34-bf07-4dd5-83ee-740d2089df73")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link GaWorkloadBehaviorModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaWorkloadBehavior_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("999fb9fb-967c-4c9e-af2d-fd6a264e93c6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaWorkloadBehaviorModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaWorkloadBehavior_ModelElement >> then instantiate a {@link GaWorkloadBehaviorModelElement} proxy.
     * 
     * @return a {@link GaWorkloadBehaviorModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("c945f1aa-6cde-416f-a754-2bd23031c011")
    public static GaWorkloadBehaviorModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaWorkloadBehaviorModelElement.STEREOTYPE_NAME);
        return GaWorkloadBehaviorModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaWorkloadBehaviorModelElement} proxy from a {@link ModelElement} stereotyped << GaWorkloadBehavior_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaWorkloadBehaviorModelElement} proxy or <i>null</i>.
     */
    @objid ("10dd179e-536f-4969-aa69-e8c638a1ee8f")
    public static GaWorkloadBehaviorModelElement instantiate(final ModelElement obj) {
        return GaWorkloadBehaviorModelElement.canInstantiate(obj) ? new GaWorkloadBehaviorModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaWorkloadBehaviorModelElement} proxy from a {@link ModelElement} stereotyped << GaWorkloadBehavior_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link GaWorkloadBehaviorModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3e613f8c-f533-479e-a49c-444f76c01e48")
    public static GaWorkloadBehaviorModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaWorkloadBehaviorModelElement.canInstantiate(obj))
        	return new GaWorkloadBehaviorModelElement(obj);
        else
        	throw new IllegalArgumentException("GaWorkloadBehaviorModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("76f66f35-9312-4e45-91c1-e8209d73d8c3")
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
        GaWorkloadBehaviorModelElement other = (GaWorkloadBehaviorModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("9824a8e2-74b3-42a3-8868-b439d068e0ba")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for List<String> property 'GaWorkloadBehavior_ModelElement_behavior'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8609b45f-e0cd-4411-bafa-6f66ed70c47a")
    public List<String> getGaWorkloadBehavior_ModelElement_behavior() {
        return this.elt.getTagValues(GaWorkloadBehaviorModelElement.MdaTypes.GAWORKLOADBEHAVIOR_MODELELEMENT_BEHAVIOR_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaWorkloadBehavior_ModelElement_demand'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("39ca9ea7-edca-4247-9711-dfa464be0184")
    public List<String> getGaWorkloadBehavior_ModelElement_demand() {
        return this.elt.getTagValues(GaWorkloadBehaviorModelElement.MdaTypes.GAWORKLOADBEHAVIOR_MODELELEMENT_DEMAND_TAGTYPE_ELT);
    }

    @objid ("c4c209bf-5652-4eda-ac9d-4bd798571755")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaWorkloadBehavior_ModelElement_behavior'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5fe4cd03-b581-437f-b5b2-5600374f45d1")
    public void setGaWorkloadBehavior_ModelElement_behavior(final List<String> values) {
        this.elt.putTagValues(GaWorkloadBehaviorModelElement.MdaTypes.GAWORKLOADBEHAVIOR_MODELELEMENT_BEHAVIOR_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaWorkloadBehavior_ModelElement_demand'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e8c5bb49-82b7-43c3-9e3d-587af9172d13")
    public void setGaWorkloadBehavior_ModelElement_demand(final List<String> values) {
        this.elt.putTagValues(GaWorkloadBehaviorModelElement.MdaTypes.GAWORKLOADBEHAVIOR_MODELELEMENT_DEMAND_TAGTYPE_ELT, values);
    }

    @objid ("5aefeac2-c360-4f6b-a3cd-0a738025d039")
    protected GaWorkloadBehaviorModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("509f7b91-223f-42cf-b088-c17d920b1588")
    public static final class MdaTypes {
        @objid ("f1258384-efb9-4984-ba17-513bfd005763")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e02cbab1-f265-4270-b290-feecc67c1b9e")
        public static TagType GAWORKLOADBEHAVIOR_MODELELEMENT_BEHAVIOR_TAGTYPE_ELT;

        @objid ("5514c521-2ab3-4865-a44e-5edfa5f26604")
        public static TagType GAWORKLOADBEHAVIOR_MODELELEMENT_DEMAND_TAGTYPE_ELT;

        @objid ("74470646-d89a-4cc9-846f-e60bb65a0015")
        private static Stereotype MDAASSOCDEP;

        @objid ("428127b3-aac1-4fa3-a08e-da10c740625c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4145d13a-6957-4bd7-b77b-a8db55744a48")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "036f463e-0ccf-11df-8525-001302895b2b");
            GAWORKLOADBEHAVIOR_MODELELEMENT_BEHAVIOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036f463f-0ccf-11df-8525-001302895b2b");
            GAWORKLOADBEHAVIOR_MODELELEMENT_DEMAND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036f4640-0ccf-11df-8525-001302895b2b");
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
