/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << HwDrive_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("32ad45b1-90dd-4ff0-92b4-f736b6e3313f")
public class HwDriveClassifier extends HwMemoryClassifier {
    @objid ("67688fe4-22cf-4784-a6b5-a4e747107956")
    public static final String STEREOTYPE_NAME = "HwDrive_Classifier";

    @objid ("9bb8b730-7656-47cc-b037-839c51b18602")
    public static final String HWDRIVE_CLASSIFIER_BUFFER_TAGTYPE = "HwDrive_Classifier_buffer";

    @objid ("eb2fb07e-92e8-4432-9ec5-7762f94b366a")
    public static final String HWDRIVE_CLASSIFIER_SECTORSIZE_TAGTYPE = "HwDrive_Classifier_sectorSize";

    /**
     * Tells whether a {@link HwDriveClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwDrive_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e8fefc24-5eaa-4528-b8d9-b835740fef1a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwDrive_Classifier >> then instantiate a {@link HwDriveClassifier} proxy.
     * 
     * @return a {@link HwDriveClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("a70b70c1-3e19-4815-bd6d-99d38e450020")
    public static HwDriveClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveClassifier.STEREOTYPE_NAME);
        return HwDriveClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwDriveClassifier} proxy from a {@link Classifier} stereotyped << HwDrive_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwDriveClassifier} proxy or <i>null</i>.
     */
    @objid ("e24c5207-2f02-46a6-9fa3-1f945cf40987")
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
    @objid ("e93986dc-52d7-4af3-8617-897f87f5c0b3")
    public static HwDriveClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwDriveClassifier.canInstantiate(obj))
        	return new HwDriveClassifier(obj);
        else
        	throw new IllegalArgumentException("HwDriveClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dd766e6b-54ca-479d-971f-1c6162c4922d")
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
    @objid ("0d64f0f1-6d8d-4e64-aed5-262658d60902")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwDrive_Classifier_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("63a2bf85-d0c4-4df2-9a3a-2feec12d2f7e")
    public String getHwDrive_Classifier_buffer() {
        return this.elt.getTagValue(HwDriveClassifier.MdaTypes.HWDRIVE_CLASSIFIER_BUFFER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDrive_Classifier_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("219d1656-9e85-4a05-adb6-e914f0e98548")
    public String getHwDrive_Classifier_sectorSize() {
        return this.elt.getTagValue(HwDriveClassifier.MdaTypes.HWDRIVE_CLASSIFIER_SECTORSIZE_TAGTYPE_ELT);
    }

    @objid ("b01612f2-c14a-4236-8f0f-7f3355de2e85")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDrive_Classifier_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c0932993-3d75-4cec-a0ad-67c29ea94652")
    public void setHwDrive_Classifier_buffer(final String value) {
        this.elt.putTagValue(HwDriveClassifier.MdaTypes.HWDRIVE_CLASSIFIER_BUFFER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDrive_Classifier_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9de9fcfc-a6ce-4727-ad2c-7fab2b28d213")
    public void setHwDrive_Classifier_sectorSize(final String value) {
        this.elt.putTagValue(HwDriveClassifier.MdaTypes.HWDRIVE_CLASSIFIER_SECTORSIZE_TAGTYPE_ELT, value);
    }

    @objid ("7a3fa485-445b-47bf-a056-9d270c3b6d64")
    protected HwDriveClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("9bd5bcc7-fe9f-4024-b72a-f45928a2538a")
    public static final class MdaTypes {
        @objid ("1f52614c-86af-4325-a81b-12007845a49f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b30a2276-b87d-45b7-b44e-9c3f7b359261")
        public static TagType HWDRIVE_CLASSIFIER_SECTORSIZE_TAGTYPE_ELT;

        @objid ("27c68210-081c-4de7-a540-d823946a65f4")
        public static TagType HWDRIVE_CLASSIFIER_BUFFER_TAGTYPE_ELT;

        @objid ("689bcc86-6d82-4dc0-88af-70f95d3499a6")
        private static Stereotype MDAASSOCDEP;

        @objid ("e54668d8-2b13-462c-ab27-7633c5bf5b59")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e9ce9802-fef1-49b8-8c34-a469c22f8793")
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
