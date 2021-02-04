/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.classifier.HwResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwCommunicationResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9cb46b35-44c1-480d-a531-d45cee682f9d")
public class HwCommunicationResourceClassifier extends HwResourceClassifier {
    @objid ("c4c0bcb1-8cd9-438c-879f-b0437288ba60")
    public static final String STEREOTYPE_NAME = "HwCommunicationResource_Classifier";

    /**
     * Tells whether a {@link HwCommunicationResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwCommunicationResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5693cb84-ab99-451c-88ef-2dbf8ad4f90f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwCommunicationResource_Classifier >> then instantiate a {@link HwCommunicationResourceClassifier} proxy.
     * 
     * @return a {@link HwCommunicationResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("8916a2b1-f75f-474f-93c2-6f02c7e8f208")
    public static HwCommunicationResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceClassifier.STEREOTYPE_NAME);
        return HwCommunicationResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceClassifier} proxy from a {@link Classifier} stereotyped << HwCommunicationResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwCommunicationResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("419b9c03-676d-45a8-b2b3-006fc77a40bb")
    public static HwCommunicationResourceClassifier instantiate(final Classifier obj) {
        return HwCommunicationResourceClassifier.canInstantiate(obj) ? new HwCommunicationResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceClassifier} proxy from a {@link Classifier} stereotyped << HwCommunicationResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwCommunicationResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ab6420b4-154c-4be1-9e88-acec6cf5ec75")
    public static HwCommunicationResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwCommunicationResourceClassifier.canInstantiate(obj))
        	return new HwCommunicationResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("HwCommunicationResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e29bda40-95f5-4150-a49b-99059d2b81b4")
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
        HwCommunicationResourceClassifier other = (HwCommunicationResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("cff982cb-b31d-4370-ba9b-05a8524abb18")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("0340d94e-98bc-4302-8a97-a5ba21c3447d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3808619c-9266-4db0-8013-556057007223")
    protected HwCommunicationResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("b65b3ac7-a55f-4d2d-860d-b1fff5187413")
    public static final class MdaTypes {
        @objid ("fe44f3af-3767-4259-bb50-c74a919ff334")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("804d6e60-9646-4692-9f92-3a8c33552caa")
        private static Stereotype MDAASSOCDEP;

        @objid ("eb6171aa-687e-473f-96ce-e9fde5cc471f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9356f214-ac65-45a0-b747-e1760312fc72")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fea646-0ccf-11df-8525-001302895b2b");
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
