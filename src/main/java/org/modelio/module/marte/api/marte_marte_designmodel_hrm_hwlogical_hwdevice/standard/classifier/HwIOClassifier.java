/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.classifier;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwI_O_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("44197744-7155-4361-93e5-0d2b016be1c7")
public class HwIOClassifier extends HwDeviceClassifier {
    @objid ("1875e712-6d52-4565-bc81-d4fef7d6cf06")
    public static final String STEREOTYPE_NAME = "HwI_O_Classifier";

    /**
     * Tells whether a {@link HwIOClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwI_O_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("47e9c449-499e-4caa-9f84-390b1d01d77c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwIOClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwI_O_Classifier >> then instantiate a {@link HwIOClassifier} proxy.
     * 
     * @return a {@link HwIOClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("7081208a-14b1-4db6-a8f1-0f79ccc69fdc")
    public static HwIOClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwIOClassifier.STEREOTYPE_NAME);
        return HwIOClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwIOClassifier} proxy from a {@link Classifier} stereotyped << HwI_O_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwIOClassifier} proxy or <i>null</i>.
     */
    @objid ("2b4550ae-ddeb-4d8b-afca-53775c212c00")
    public static HwIOClassifier instantiate(final Classifier obj) {
        return HwIOClassifier.canInstantiate(obj) ? new HwIOClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwIOClassifier} proxy from a {@link Classifier} stereotyped << HwI_O_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwIOClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c576d9ba-ad40-4098-a020-6b75fe9927f9")
    public static HwIOClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwIOClassifier.canInstantiate(obj))
        	return new HwIOClassifier(obj);
        else
        	throw new IllegalArgumentException("HwIOClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ca2b07b0-7018-4356-a712-5667e524c89d")
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
        HwIOClassifier other = (HwIOClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("be0568d1-34ef-4a9f-8a09-c83878e1962f")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("d6841cae-4289-46ac-90c4-e0128c61f308")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("59b777cf-73cd-470c-bd27-984442782740")
    protected HwIOClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("a78eb9f3-6531-4b2b-b543-2ce0ba127e92")
    public static final class MdaTypes {
        @objid ("ddda23c0-77aa-4570-9089-b98e274a7df2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8c504688-a7fe-429e-9458-c58ec357c207")
        private static Stereotype MDAASSOCDEP;

        @objid ("91c9b074-73a2-49af-8eac-5ddbbd0404ed")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1dc02b89-fec4-4226-a6ea-77e9101ecc53")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "08146d7d-10b1-11df-81d9-0014222a9f79");
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
