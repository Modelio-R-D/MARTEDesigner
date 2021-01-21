/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement;

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
 * Proxy class to handle a {@link ModelElement} with << GaRequestedService_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("de721254-f24d-40ea-b14d-2503ecbd3bec")
public class GaRequestedServiceModelElement extends GaStepModelElement {
    @objid ("4d3d3db2-e929-474f-80e8-22e62e85d0d3")
    public static final String STEREOTYPE_NAME = "GaRequestedService_ModelElement";

    /**
     * Tells whether a {@link GaRequestedServiceModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaRequestedService_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("23f7019a-e789-45ed-936c-7954a18f0cf2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaRequestedServiceModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaRequestedService_ModelElement >> then instantiate a {@link GaRequestedServiceModelElement} proxy.
     * 
     * @return a {@link GaRequestedServiceModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("e451f585-a9d5-4b3a-9ae1-6d8cf1f72832")
    public static GaRequestedServiceModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaRequestedServiceModelElement.STEREOTYPE_NAME);
        return GaRequestedServiceModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaRequestedServiceModelElement} proxy from a {@link ModelElement} stereotyped << GaRequestedService_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaRequestedServiceModelElement} proxy or <i>null</i>.
     */
    @objid ("252babf5-9b96-4956-a205-f1a09ad05dae")
    public static GaRequestedServiceModelElement instantiate(final ModelElement obj) {
        return GaRequestedServiceModelElement.canInstantiate(obj) ? new GaRequestedServiceModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaRequestedServiceModelElement} proxy from a {@link ModelElement} stereotyped << GaRequestedService_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link GaRequestedServiceModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8396c425-6db2-46b1-8ef3-d35845942558")
    public static GaRequestedServiceModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaRequestedServiceModelElement.canInstantiate(obj))
        	return new GaRequestedServiceModelElement(obj);
        else
        	throw new IllegalArgumentException("GaRequestedServiceModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cd05940d-430a-4537-bbef-c956036f3b5a")
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
        GaRequestedServiceModelElement other = (GaRequestedServiceModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("e7d32aff-758c-4faf-aa76-04c8f740e1ec")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("10bae648-283a-4852-8717-25102bea8bb5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e92d6df5-6976-48ee-85bb-29f29e1075d8")
    protected GaRequestedServiceModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("bf6bbd83-cb69-4c03-8171-ba4cdedccc56")
    public static final class MdaTypes {
        @objid ("97150b66-1975-49ad-849f-39307a5b54fe")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5623e426-fcc5-495e-a3dc-b44f956338f3")
        private static Stereotype MDAASSOCDEP;

        @objid ("6678e73c-cae0-4f98-955d-b9efc43f9be9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1370b9d2-c627-46e3-a346-372f9d3075ec")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0346bebc-0ccf-11df-8525-001302895b2b");
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
