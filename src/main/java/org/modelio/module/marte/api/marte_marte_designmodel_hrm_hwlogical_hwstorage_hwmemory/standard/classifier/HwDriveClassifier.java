/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
 * Proxy class to handle a {@link Classifier} with << HwDrive_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwDriveClassifier extends HwMemoryClassifier {
    public static final String STEREOTYPE_NAME = "HwDrive_Classifier";

    public static final String HWDRIVE_CLASSIFIER_BUFFER_TAGTYPE = "HwDrive_Classifier_buffer";

    public static final String HWDRIVE_CLASSIFIER_SECTORSIZE_TAGTYPE = "HwDrive_Classifier_sectorSize";

    /**
     * Tells whether a {@link HwDriveClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwDrive_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwDrive_Classifier >> then instantiate a {@link HwDriveClassifier} proxy.
     * 
     * @return a {@link HwDriveClassifier} proxy on the created {@link Classifier}.
     */
    public static HwDriveClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveClassifier.STEREOTYPE_NAME);
        return HwDriveClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwDriveClassifier} proxy from a {@link Classifier} stereotyped << HwDrive_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwDriveClassifier} proxy or <i>null</i>.
     */
    public static HwDriveClassifier instantiate(final Classifier obj) {
        return HwDriveClassifier.canInstantiate(obj) ? new HwDriveClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDriveClassifier} proxy from a {@link Classifier} stereotyped << HwDrive_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwDriveClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwDriveClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwDriveClassifier.canInstantiate(obj))
        	return new HwDriveClassifier(obj);
        else
        	throw new IllegalArgumentException("HwDriveClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        HwDriveClassifier other = (HwDriveClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwDrive_Classifier_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDrive_Classifier_buffer() {
        return this.elt.getTagValue(HwDriveClassifier.MdaTypes.HWDRIVE_CLASSIFIER_BUFFER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDrive_Classifier_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDrive_Classifier_sectorSize() {
        return this.elt.getTagValue(HwDriveClassifier.MdaTypes.HWDRIVE_CLASSIFIER_SECTORSIZE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDrive_Classifier_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDrive_Classifier_buffer(final String value) {
        this.elt.putTagValue(HwDriveClassifier.MdaTypes.HWDRIVE_CLASSIFIER_BUFFER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDrive_Classifier_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDrive_Classifier_sectorSize(final String value) {
        this.elt.putTagValue(HwDriveClassifier.MdaTypes.HWDRIVE_CLASSIFIER_SECTORSIZE_TAGTYPE_ELT, value);
    }

    protected HwDriveClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWDRIVE_CLASSIFIER_SECTORSIZE_TAGTYPE_ELT;

        public static TagType HWDRIVE_CLASSIFIER_BUFFER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "08108fdf-100a-11df-86fe-0014222a9f79");
            HWDRIVE_CLASSIFIER_SECTORSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "18b52f0e-100a-11df-86fe-0014222a9f79");
            HWDRIVE_CLASSIFIER_BUFFER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "18b52f0f-100a-11df-86fe-0014222a9f79");
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
